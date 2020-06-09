package kr.ac.yeongnam.day16;


class BoyFriendThread2 extends Thread {

	@Override
	public void run() {
		System.out.println("반갑읍니다. 보이프렌드입니다.");
	
		
	}
	
	
}

class GirlFriendThread2 extends Thread{
	
}

public class JoinMain {
	
	public static void main(String[] args) {
		
		BoyFriendThread2 bf = new BoyFriendThread2();
		bf.start();
		
	}

}
