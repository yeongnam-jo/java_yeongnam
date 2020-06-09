package kr.ac.yeongnam.day16;

import java.util.Date;

class SleepThread extends Thread {
	@Override
	public void run() {
		
		while(true){
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("현재 시간 " + new Date().toLocaleString());
			
		}
	}
}


public class SleepMain {
	
	public static void main(String[] args) {
		//run 하는 중 sleep 하는 순간, run 상태에 빠져 나와서(다른 스레드가 작업함) 대기상태(block, wating, time-wating 등)에 있는다.
		
		SleepThread st = new SleepThread();
		st.start();
		
		
		while(true) {
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("go!");
		}
		

		/*
		System.out.println("메인스레드를 2초동안 잠들게 하겠습니다.");
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("메인스레드가 2초후에 깨어났습니다.");
		*/
	}

}
