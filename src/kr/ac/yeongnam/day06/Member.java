package kr.ac.yeongnam.day06;

public class Member {

	String name; 		// 이름
	int age;	 		// 나이
	String bloodType;   // 혈액형

	

	Member(){
		// System.out.println(" hello "); ==> 에러가 납니다.
		this("알 수 없음", -1, "알 수 없음");
		// this 생성자는, 생성자의 첫 라인에 와야한다. 멤버변수를 초기화 하는 것이 목적이기 때문이다.
		// 아래의 프린트 문장이, this 생성자 위쪽에 오면 에러가 난다.
		System.out.println(" hello ");
		
		
		/*
		name = "알 수 없음";
		age = -1;
		bloodType = "알 수 없음";		
		*/
	}
	
	Member(String name){
		
		this(name, -1, "알 수 없음");
		/*
		name = n;
		age = -1;
		bloodType = "알 수 없음";	
		*/	
	}
	
	Member(String name, int age){
		
		// Member(name, age, "알 수 없음"); 
		// 위와 같이 직접 생성자를 쓸 수 없다. new를 통해 객체를 생성할 때만, 사용할 수 있다.
		// 그럼 같은 기능을 사용하려면 어떻게 하는가. this 라는 키워드를 사용한다.
		// this 생성자는, 생성자 내에서만 오버로딩한 생성자를 호출할 때 사용한다.
		
		this(name, age, "알 수 없음");
		
		/*
		name = n;
		this.age = age;
		bloodType = "알 수 없음";	
		*/	
	}
	
	Member(String name, int age, String bloodType){
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;		
	}
	
	
	void info() {
		System.out.println("이름 : " + name 
				+ ", 나이 : " + (age == -1 ? "알 수 없음" : age) + ", 혈액형 : " + bloodType);
	}


	
	/*
	Member(){
		name = "알 수 없음";
		age = -1;
		bloodType = "알 수 없음";		
	}
	
	Member(String n){
		name = n;
		age = -1;
		bloodType = "알 수 없음";		
	}
	
	Member(String n, int age){
		name = n;
		this.age = age;
		bloodType = "알 수 없음";		
	}
	
	Member(String name, int age, String bloodType){
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;		
	}
	
	
	void info() {
		System.out.println("이름 : " + name 
				+ ", 나이 : " + (age == -1 ? "알 수 없음" : age) + ", 혈액형 : " + bloodType);
	}
	*/
	
}
