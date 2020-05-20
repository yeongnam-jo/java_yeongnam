package kr.ac.yeongnam.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertMain03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			// 1단계
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2단계
			String url 		= "jdbc:oracle:thin:@172.16.88.120:1521:dink";
			String user 	= "DA09";
			String password = "DA09";
			
			conn = DriverManager.getConnection(url, user, password);
			
			// 3단계: SQL 작성(PreparedStatement)		
			System.out.print("등록 할 아이디를 입력하세요 : ");
			String id = sc.nextLine();
			
			System.out.print("등록 할 이름을 입력하세요 : ");
			String name = sc.nextLine();

			String sql = "insert into t_test(id, name)";
				   sql += " values(?, ?)"; // 물음표는 밑에서 setXxxx 으로 채운다.
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, name);				
			
			// 4단계: SQL문 실행 
			int cnt = pstmt.executeUpdate();
			System.out.println("총 " + cnt + "개 행 삽입");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5단계: 접속 종료
			// ===> Stack 형식으로 불러오니까, 마지막에 불러온 것 먼저 종료해야 안전하다.
			if(pstmt != null) {
				try {
					pstmt.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
}
