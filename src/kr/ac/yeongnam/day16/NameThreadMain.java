package kr.ac.yeongnam.day16;


class NameThread extends Thread{
	
	public NameThread() {
		
	}
	
	
	
	
	public NameThread(String name) {
		// this.name = name; // 이거슨 ! Thread것이야. private이겠지. 그러니 빨간 줄나지(컴파일에러)
		setName(name);
	}
	
	@Override
	public void run() {
		System.out.println("스레드 이름: " + getName()); // 자신 내에서는 객체생성하지 않고 곧바로 메소드를 사용할 수 있음!	
		// NameThread-1 ==> ChangeThread-1
		// NameThread-2 ==> ChangeThread-2
		
		int idx = getName().lastIndexOf("-");
		String no = getName().substring(idx);
		
		setName("ChangeThread" + no);
		System.out.println("변경된 스레드 이름: " + getName());
	}
	
	
}

public class NameThreadMain {
	public static void main(String[] args) {
		
		NameThread nt = new NameThread("NameThread-1");
		NameThread nt2 = new NameThread("NameThread-2");

		nt.start(); // start하면 자동으로 JVM이 runnable - run 해준다.
		nt2.start();
		
		
	}

}
