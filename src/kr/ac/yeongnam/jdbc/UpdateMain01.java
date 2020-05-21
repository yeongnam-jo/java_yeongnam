package kr.ac.yeongnam.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import kr.ac.yeongnam.util.JDBCClose;

/*
 	ID를 입력하세요 			: lee
 	변경할 이름을 입력하세요 	: 이길동
 	1개의 행이 변경되었습니다.
 	
 */

public class UpdateMain01 {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			
			// 1단계 ~ 2단계
			ConnectionFactory factory = new ConnectionFactory();
			conn = factory.getConnection();
			
			/*
			// 1단계: JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Oracle driver 연결");
			
			// 2단계: DB 연결 및 Connection 객체 생성
			String url 		= "jdbc:oracle:thin:@172.16.88.120:1521:dink";
			String user 	= "DA09";
			String password = "DA09";			
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB 연결 및 Connection 생성");
			*/
			
			// 3단계
			Scanner sc = new Scanner(System.in);
			System.out.print("ID를 입력하세요 : ");
			String id = sc.nextLine();
			System.out.print("변경할 이름을 입력하세요 : ");
			String name = sc.nextLine();
			sc.close();
			
			String sql = "UPDATE T_TEST ";
				   sql += " SET NAME = ?";
				   sql += " WHERE ID = ?";
				   
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, id);
			
			// 4단계: sql 실행 및 RS 받아오기
			int cnt = pstmt.executeUpdate();
			System.out.println("총 " + cnt + "개 행이 수정되었습니다.");
	
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5단계: 2단계의 커넥션을 해제
			JDBCClose.close(conn, pstmt);
						
			/*
			if(pstmt != null) {
				try {
					pstmt.close();
					System.out.println("prepared Statement 종료");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			
			if(conn != null) {
				try {
					conn.close();
					System.out.println("커넥션 close");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			*/
		}
	}
}
