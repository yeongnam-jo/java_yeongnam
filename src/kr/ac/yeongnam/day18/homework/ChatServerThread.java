package kr.ac.yeongnam.day18.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.HashMap;

public class ChatServerThread implements Runnable{
	
	Socket client;
	BufferedReader br;
	PrintWriter pw;
	
	String user;
	HashMap<String, PrintWriter> hm;
	InetAddress ip;
	String msg;
	
	public ChatServerThread(Socket client, HashMap<String, PrintWriter> hm) {
		this.client = client;
		this.hm = hm;
		
		try {
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			pw = new PrintWriter(client.getOutputStream());
			
			user = br.readLine();
			ip = client.getInetAddress();
			System.out.println("[" + user + "]님이 접속했습니다.");
			
			synchronized(hm) {
				hm.put(user, pw);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void run() {
		String msg;
		
		try {
			while((msg  = br.readLine()) != null) {
				if(msg.equals("/quit")) {
					synchronized(hm) {
						hm.remove(user);
					}
					break;
				} else if(msg.indexOf("/to") >= 0) {
					sendMsg(msg);
				} else {
					broadcast("[" + user + "] : " + msg);
				}
				
			} 
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			synchronized(hm) {
				hm.remove(user);
			}

		}
		
	}
	
	public void broadcast(String msg) {
		synchronized(hm) {
			
			for(PrintWriter pw : hm.values()) {
				pw.println(msg);
				pw.flush();
				
			}
		}
	}
	
	public void sendMsg(String msg) {
		int begin = msg.indexOf(" ") + 1;
		int end = msg.indexOf(" ", begin);
		
		if(end != -1) {
			String user = msg.substring(begin, end);
			String msgTmp = msg.substring(end+1);
			PrintWriter pw = hm.get(user);
			
			pw.println("[" + user + " 님이 다음 귓속말을 보냈습니다] : " + msgTmp);
			pw.flush();
		}
		
	}

}
