package kr.ac.yeongnam.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertMain01 {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			// 1단계: JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1단계 드라이버 로딩...");
			
			// 2단계: DriverManager를 이용한 DB 접속, Connection 객체 얻기			
			String url 		= "jdbc:oracle:thin:@172.16.88.120:1521:dink";
			String user 	= "DA09";
			String password = "DA09";
			
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("2단계 conn : " + conn);
			
			// 3단계: SQL문 실행(Statement)
			stmt = conn.createStatement();
			String sql = "INSERT INTO T_TEST(ID, NAME) VALUES('hong', '홍길동')";
			
			// 4단계: SQL문 실행 및 결과 도출
			int cnt = stmt.executeUpdate(sql);
			System.out.println("총 " + cnt + "개 행 삽입...");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			// 5단계: 접속 종료
			// ===> Stack 형식으로 불러오니까, 마지막에 불러온 것 먼저 종료해야 안전하다.
			if(stmt != null) {
				try {
					stmt.close();
					
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
