package kr.ac.yeongnam.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.yeongnam.util.JDBCClose;

public class SelectMain01 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
				
		try {
			conn = new ConnectionFactory().getConnection();
			
			String sql = "select * from t_test";
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();	
			
			
			// 몇개의 레코드가 있어?
			
			int cnt = 0;
			System.out.println("=======SELECT========");
			while(rs.next()) {
				String id = rs.getString("ID");
				String name = rs.getString("NAME");
				
				System.out.println("ID: " + id + " \t"+ " NAME: " + name);
			}
			
			// System.out.println(rs.next());
			
					
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
	}

}
