package kr.ac.yeongnam.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	
	public Connection getConnection() {
		
		Connection conn = null;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Oracle driver 연결");

			// String url 		= "jdbc:oracle:thin:@172.16.88.120:1521:dink";
			// String user 	= "DA09";
			// String password = "DA09";
			String url 		= "jdbc:oracle:thin:@172.16.88.129:1521:xe";
			String user 	= "hr";
			String password = "hr";
			
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB 연결 및 Connection 생성");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}

}
