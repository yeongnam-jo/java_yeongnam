package kr.ac.yeongnam.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import kr.ac.yeongnam.util.JDBCClose;

public class SelectMain03 {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			conn = new ConnectionFactory().getConnection();
			System.out.println("====con====");
		
			
			String sql = "SELECT J.JOB_TITLE, AVG(SALARY) ";
				   sql += "FROM EMPLOYEES E, JOBS J  ";
				   sql += "WHERE E.JOB_ID = J.JOB_ID AND E.SALARY > ? ";
				   sql += "GROUP BY J.JOB_TITLE ";
				   sql += "ORDER BY AVG(SALARY) DESC ";
				   
			System.out.print("급여를 입력하세요 : ");
			int sal = sc.nextInt();
			sc.nextLine();
			sc.close();
								
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sal);
			
			ResultSet rs = pstmt.executeQuery();
			int cnt = 0;
			while(rs.next()) {
				String jobTitle = rs.getString("JOB_TITLE");
				int avgSal = rs.getInt("AVG(SALARY)");
				
				System.out.printf("[%s] %d\n", jobTitle, avgSal);
				cnt++;
				// System.out.println("JOB_TITLE: " + jobTitle + " \t" + " AVG_SALE: " + avgSal);
			}
			
			System.out.println("총 [" + cnt + "]개 행이 검색됐습니다.");
		
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
	}
}
