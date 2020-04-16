package kr.ac.yeongnam.day05;

// 실행 클래스
public class CarMain {
	
	// main 메소드를 실행하려면, main 메소드를 가지고 있는 클래스의 객체를 생성해야 하지 않는가?
	// 그것은 JVM이 자동으로 만든다.
	// main 메소드를 가지고 있는 class를 '실행 클래스'라고 한다.

	public static void main(String[] args) {
		
		Car c = new Car();
		
		System.out.println("c : " + c); // 주소값 반환
		c.name = "sonata";
		c.price = 2500;
		
		Car c2 = new Car(); // new 키워드를 쓰면, 해당 클래스의 멤버변수를 초기화 해준다. String => null, int => 0 등
		System.out.println("브랜드명: " + c.name + ", 가격: " + c.price + "만원");
		System.out.println("브랜드명: " + c2.name + ", 가격: " + c2.price + "만원");
		
		
		/*
		int hi;
		// System.out.println(hi); // 초기화 하지 않아서 에러난다.
		*/

	}

}
