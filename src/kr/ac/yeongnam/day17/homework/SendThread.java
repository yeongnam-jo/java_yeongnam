package kr.ac.yeongnam.day17.homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SendThread extends Thread{
	
	private Socket socket;
	
	@Override
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter sendWriter = new PrintWriter(socket.getOutputStream());
			String sendString;
			
			
			while(true) {
				sendString = br.readLine();
				sendWriter.println(sendString);
				sendWriter.flush();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}



	public void setSocket(Socket socket) {
		this.socket = socket;
	}

}
