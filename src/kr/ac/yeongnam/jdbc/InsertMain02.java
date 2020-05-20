package kr.ac.yeongnam.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertMain02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		Statement stmt = null; // 이객체는 잘 안쓴다. prepared 쓰는게 보기에 훨씬 좋다.
		
		try {
			// 1단계
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2단계
			String url 		= "jdbc:oracle:thin:@172.16.88.120:1521:dink";
			String user 	= "DA09";
			String password = "DA09";
			
			conn = DriverManager.getConnection(url, user, password);
			
			// 3단계
			stmt = conn.createStatement();
			
			System.out.print("등록 할 아이디를 입력하세요 : ");
			String id = sc.nextLine();
			
			System.out.print("등록 할 이름을 입력하세요 : ");
			String name = sc.nextLine();

			String sql = "INSERT INTO T_TEST(id, name) ";
			sql += " values(\'" + id + "\','" + name + "\')";
			// 정수는 붙일 필요 없지만, 문자는 싱글쿼테이션으로 감싸야 한다. 근데, 눈에띄지 않는다. \ 써서 하자.
					
			/*
			String sql = "INSERT INTO T_TEST(id, name) ";
				   sql += " values('park', '박길동') ";
		 	*/
		
			// 4단계
			int cnt = stmt.executeUpdate(sql);
			System.out.println("총 " + cnt + "개 행이 삽입...");
			
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
