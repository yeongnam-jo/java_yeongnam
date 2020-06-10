package kr.ac.yeongnam.day18;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class RecieverMain {

	
    //@@@@ 서버 역할 @@@@
	public static void main(String[] args) {
		try {
			DatagramSocket socket = new DatagramSocket(10002);
			System.out.println("[수신 시작]");
			
			byte[] buf = new byte[100]; // 몇글자 올지몰라서, 넉넉하게 100바이트 생성해둠.
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			
			
			while(true) {
				socket.receive(packet); // receive 메소드를 통해 데이터를 받을 때까지 대기
				String msg = new String(packet.getData());
				System.out.println("[수신된 내용] : " + msg);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
