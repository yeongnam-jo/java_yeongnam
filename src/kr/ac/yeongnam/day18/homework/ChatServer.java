package kr.ac.yeongnam.day18.homework;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class ChatServer {

	
	ServerSocket server = null;
	Socket client = null;
	HashMap<String, PrintWriter> hm;
	
	
	public ChatServer() {
		
		try {
			ChatServerThread sr;
			Thread t;
			
			
			server = new ServerSocket(10001);
			System.out.println("** 채팅 서버 시작 **");
			
			hm = new HashMap<String, PrintWriter>();
			
			while(true) {
				client = server.accept();
				if(client != null) {
					sr = new ChatServerThread(client, hm);
					t= new Thread(sr);
					t.start();
				}
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
