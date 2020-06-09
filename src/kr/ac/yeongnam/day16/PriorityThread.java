package kr.ac.yeongnam.day16;

public class PriorityThread extends Thread{
	public PriorityThread() {
		super();
	}
	
	public PriorityThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		super.run();
	}
	
	// 스레드의 우선순위가 높다는 것 : 먼저 선택될 확률이 높다는 것. 즉. 우선적인 순서를 보장하지 않는다!!!!!!증말 다루기 어려운놈임.
	
	// 하나의 프로세스가 가지고 있는 자원을 공유하기 위해 스레드를 사용한다.
	// 스레드의 우선순위와 끝나는 순서를 보장할 수는 없다.
	// 
	

}
