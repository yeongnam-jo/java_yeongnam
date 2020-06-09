package kr.ac.yeongnam.day17.homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceiveThread extends Thread{
	
	private Socket socket;
	
	@Override
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String receiveString;
			
			while(true) {
				receiveString = br.readLine();
				
				if(receiveString == null) {
					System.out.println("연결이 끊겼습니다.");
					break;
				} else {
					System.out.println("상대방 : " + receiveString);
				}
			}
			
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void setSocket(Socket socket) {
		this.socket = socket;
	}

}
