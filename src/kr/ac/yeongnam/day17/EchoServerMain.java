package kr.ac.yeongnam.day17;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 	java EchoClientMain 10001
 */
public class EchoServerMain {

	public static void main(String[] args) {
		
		//System.out.println(args.length);
		if(args.length != 1) {
			System.out.println("==========================================");
			System.out.println(" 	사용법 : java EchoServerMain port번호");
			System.out.println("==========================================");
			System.exit(0);
		}
		
		int portNo = Integer.parseInt(args[0]);
		
		try {
			ServerSocket server = new ServerSocket(portNo);
			System.out.println("클라이언트의 접속을 기다립니다....");
			Socket client = server.accept();
			System.out.println("접속된 클라이언트 정보 : [" + client.getInetAddress() + "]");
			
			// 클라이언트가 전송해준 메세지를 수신할 객체 필요
			InputStream is = client.getInputStream(); // 바이트 스트림
			InputStreamReader isr = new InputStreamReader(is); // 문자 스트림
			BufferedReader br = new BufferedReader(isr); // 속도를 빠르게 하기 위해서
			
			
			// 수신한 메세지를 클라이언트에게 재전송 할 객체 필요
			OutputStream os = client.getOutputStream();
			OutputStreamWriter ow = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(ow);
			
			while(true) {
				String msg = br.readLine();
				if(msg == null) {
					System.out.println("클라이언트 [" + client.getInetAddress() +"]과의 접속 해제");
					client.close();
					break; //System.exit(0);
				}
				
				System.out.println("[" + client.getInetAddress() + "] : " + msg);
				pw.println(msg);
				pw.flush();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
