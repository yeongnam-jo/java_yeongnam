package kr.ac.yeongnam.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBTestMain {
	public static void main(String[] args) {
		
		
		// 1단계 : JDBC 드라이버 로딩(정해져 있음)
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공...");
			
			
			String url = "jdbc:oracle:thin:@172.16.88.120:1521:dink";
			// String url2 = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "DA09";
			String password = "DA09";
		
			Connection conn = DriverManager.getConnection(url, user, password);
			
			System.out.println("db 접속 성공 : " + conn);
			
		} catch (Exception e) {
			System.out.println("예외 발생");
			e.printStackTrace();
		}	
	}
}
