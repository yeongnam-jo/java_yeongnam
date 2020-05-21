package kr.ac.yeongnam.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import kr.ac.yeongnam.util.JDBCClose;

public class SelectMain02 {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = new ConnectionFactory().getConnection();
			
			String sql = "select * from (select * from t_test order by id) where rownum = 1";
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
						/*
			String sql 	= "SELECT * "
				   sql 	+=  "FROM( " ;
				   sql  +=  " ~~"
			*/
			
			if(rs.next()) {
				
				String id = rs.getString("ID");
				String name = rs.getString("NAME");
				System.out.println("ID: " + id + " \t" + " NAME: " + name);
				
			} else {
				
				System.out.println("등록된 id가 없습니다.");
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			JDBCClose.close(conn, pstmt);
		}
	}
}
