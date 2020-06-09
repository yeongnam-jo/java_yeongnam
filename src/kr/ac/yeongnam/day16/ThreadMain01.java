package kr.ac.yeongnam.day16;



class AAA extends Thread{
	
	@Override
	public void run() {
		while (true) {
			System.out.println("go!!");
		}
	}

}


class BBB extends Thread{
	
	@Override
	public void run() {
		while(true) {
			System.out.println("\t\t\tstop!!!!");
		}
	}
}



public class ThreadMain01 {
	
	public static void main(String[] args) {
		
		AAA aaa = new AAA();
		BBB bbb = new BBB();
		
		 
		// aaa.run(); ==> 얘는 계속 돌아간다.  스레드를 통해 동시성의 개념을 가지고 있는 게 아님. 
		aaa.start(); // 스레드를 통해 동시성을 구현하세요.
		bbb.start(); 
		
	}

}
