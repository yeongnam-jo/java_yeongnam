package kr.ac.yeongnam.day08;

class One {
	One(){
		// super(); 생략돼있다. 왜냐, 모든 클래스는 Object 클래스를 상속받기 때문이다.
		System.out.println("One() 생성자 호출...");
	}
}

class Two extends One
{
	Two(String name){
		
	}	
	
	Two(){
		// super();
		this("aaa"); // 생성자는 첫출에 써야한다
		System.out.println("Two() 생성자 호출...");
	}
}

class Three extends Two{
	Three(){
		System.out.println("Three() 생성자 호출...");
	}
}

public class ExtendMain {

	public static void main(String[] args) {

		// One one = new One();
		// Two two = new Two();
		Three tree = new Three(); // super(); 생성자가 생략돼있다는 개념을 알아야 함.
		
	}

}
