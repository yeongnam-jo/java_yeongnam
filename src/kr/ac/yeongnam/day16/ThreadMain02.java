package kr.ac.yeongnam.day16;


/*
 * Thread 생성 2가지 방식
 * 1. Thread 클래스 상속
 *   ===> 클래스는 단일 상속만 가능합니다! 
 * 2. Runnable 인터페이스 상속 : run 메소드가 abstract 이기 때문에, 오버라이드 무조건 해야 함!
 *   ===> 더 일반적이다.
 */

// 1번 thread 상속
class ExtendThread extends Thread{
	@Override
	public void run() {
		for(int i = 1; i <= 100; i++) {
			System.out.println(i + "번째 인형 눈 붙이기...");
		}
	}
}


class ImplementThread implements Runnable{
	@Override
	public void run() {
		for(int i = 1; i <= 100; i++) {
			System.out.println(i + "번째 인형 만들기...");
		}
	}
}


public class ThreadMain02 {
	
	public static void main(String[] args) {
		
		System.out.println("현재 실행중인 스레드 개수: " + Thread.activeCount() );
		System.out.println("아직 다른 스레드 안만들었다.");
		System.out.println("jvm은 메인메소드도 스레드로 동작한다. 그래서 실행 스레드가 1개로 뜬다.");
		
		ExtendThread et = new ExtendThread();
		
		et.start();  // 만들어진 시점이 이때지, main 스레드와 별도로 생성되어 스레드가 진행된다!!!!
		//thread 작업 시작 메소드가 'start'
		//레디상태의 스레드를 runnable 상태로 만드는 메소드가 start
		
		ImplementThread it = new ImplementThread();
		//얘는 start 메소드 없어! start 메소드는 Thread에만 있어ㄷㄷ..어떻게 runnable 하게 만들징?
		//Thread(Runnable r) 이라는 생성자가 있다. Runnable 인터페이스를 구현한 클래스 객체로 스레드를 생성할 수 잇음.
		Thread t = new Thread(it);
		//start라는 메소드는 Thread만 가지고 있다. Thread가 start 독점한다!!!!! 무조건 얘를 써야해!!
		t.start(); // 만들어진 시점이 이때지, main 스레드와 별도로 생성되어 스레드가 진행된다!!!!
		
		//스레드 queue 안에 들어가는게 뭔지 모른다! 
		// 스레드에 의한 작업결과는 아무도 예측할수 없다.
		// 멀티 스레딩: 여러 스레드를 동시에 실행시키는 응용프로그램을 작성하는 기법을 말합니다.
		// JVM이 runnable에 있는 애들을 자동으로 run하게 해준다.
		// 개발자는 start를 통해 멀티스레딩을 해줘! 라는 것밖에 할수 없다.
		
		// Runnable 인터페이스 상속을 더 일반적으로 사용한다.
		// Class 상속은 단일 상속만 가능하니까..! 다른 클래스를 상속받아야 하는 경우에는 Runnable 인터페이스를 상속받아서 처리하는 것이 더 안전하다.
		
		
		try {
			et.join();
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("현재 실행중인 스레드 개수: " + Thread.activeCount() );
		System.out.println("인형 작업 종료..."); // 왜 맨 위에 나오냐?
		
		/*
		for(int i = 1; i<=100; i++) { // 얘도 main 메소드의 스레드 흐름속에 있는 놈이다.
			System.out.println(i + "번째 감독중...");
		}
		*/
		
		
	}

}
