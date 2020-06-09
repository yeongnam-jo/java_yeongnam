package kr.ac.yeongnam.day17;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class AppServerMain {

	public static void main(String[] args) {
		
		
		try { // 외부장치를 이용하는 것들은 보통 체크드 익셉션
			ServerSocket server = new ServerSocket(10000); // 포트번호를 적는다
			System.out.println("애플리케이션 서버 구동....");
			
			// server.accept(); // 클라이언트가 접속할 때까지 기다린다. 포트를 종료하지 않고, 다시 앱을 실행시키면 에러난다. 그 포트가 사용중이기 때문에.
			
			Socket client = server.accept(); 
			
			System.out.println("======================");
			System.out.println("접속된 클라이언트 정보: " + client);
			System.out.println("로컬 소켓 포트 : " + client.getLocalPort());
			System.out.println("클라이언트 소켓 포트 : " + client.getPort());
			System.out.println("클라이언트 소켓 아이피 : " + client.getInetAddress());
			
			
			String msg = "접속을 환영합니다";
			OutputStream os = client.getOutputStream(); 
			// output 스트림은 바이트단위라서, 문자열로 보낼 수 없다. (영어 숫자는 될듯?)
			// DataOutputStream을 써서 보내보자.
			DataOutputStream dos = new DataOutputStream(os);
			dos.writeUTF(msg);
			dos.flush();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
