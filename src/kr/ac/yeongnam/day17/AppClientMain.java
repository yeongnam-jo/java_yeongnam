package kr.ac.yeongnam.day17;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class AppClientMain {
	public static void main(String[] args) {
		
		try {

			System.out.println("서버와의 접속을 시도합니다.");
			//Socket socket = new Socket("172.16.88.146", 10000);
			Socket socket = new Socket("localhost", 10000);
			// client가 소켓을 생성하려면, 서버의 IP와 port 번호가 필요하다.
			//cmd에서 ipconfig 해도 IP 나온다. 또는, 127.0.0.1은 자신을 가르킴.
			
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			// 서버에서 보낼 떄 UTF-8로 보냈으니까, 클라이언트에서도 utf-8로 읽어야 함.
			
			String msg = dis.readUTF();
			System.out.println("서버에서 전송된 메세지 : " + msg);

		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
