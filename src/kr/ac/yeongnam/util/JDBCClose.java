package kr.ac.yeongnam.util;


/*
	jar 파일로 묶어서 다른 프로젝트에 넣어서 활용해도 됨!!
*/


import java.sql.Connection;
import java.sql.Statement;


public class JDBCClose {
	
	public static void close(Connection conn, Statement stmt) { // PreparedStatement든, callable이든 종료하기위해.. => 다형성!
		
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
