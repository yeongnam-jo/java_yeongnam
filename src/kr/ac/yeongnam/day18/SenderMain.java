package kr.ac.yeongnam.day18;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

public class SenderMain {
	
	public static void main(String[] args) {
		try {
			DatagramSocket socket = new DatagramSocket();
			System.out.println("[송신시작]");
			
			for(int i = 1; i <=10; i++) {
				String msg = " 재원짱짱맨 : 메이플 여친구합니다 귓주세요@@-" + i;
				
				byte[] bytes = msg.getBytes();
				
				SocketAddress addr = new InetSocketAddress("172.16.88.129", 10002);
				
				DatagramPacket packet = new DatagramPacket(bytes, bytes.length, addr);
				socket.send(packet);
				System.out.println("전송한 데이터 크기 : " + bytes.length);
				Thread.sleep(2000);

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
