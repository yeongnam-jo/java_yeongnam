package kr.ac.yeongnam.day06;

// 이렇게, 선언부(?) 쪽에 클래스를 또 만들어 사용할 수 있다.
// 그러나, Method 라는 클래스를 따로 만드는 것이 좋다.
// 수업 용으로 하는 것임.

/*
 * 메소드는 오버로딩(Overloading)을 지원
 * 오버로딩: 클래스 내에 동일한 메소드명을 가지면서, 매개변수의 타입이나 개수가 다른 것(또는 매개변수의 순서가 다른 것)
 * ===> 자바는, 메소드명으로만 구분하지 않고 매개변수도 같이 비교해서 "두 메소드가 다른지 확인한다"
 * ===> 아래의 call(), call(int i) 메소드는 서로 다른 것으로 판단하여 에러가 나지 않음.
 * ===> 스타크래프트의 오버로드는, 외관상 똑같지만, 안에 누구를 태우느냐(매개변수, 스타유닛)에 따라 다른 것으로 구분한다고 생각해보자.
 
 * println 메소드도, 다 오버로딩으로 구현돼있음. ctrl 누르고 메소드명 누르면, 도큐먼트 볼 수 있음.
 * println(float x)
 * println(int ...) 등으로 구분돼있음.
 */

class Method {
	void call() {
		System.out.println("call() 메소드 호출...");
	}
	
	/*
	void call(int i) {		
		System.out.println("call(int i) 메소드 호출...");
	}
	*/
	
	void call(String str) {		
		System.out.println("call(String str) 메소드 호출...");
	}
	
	void call(double d) {		
		System.out.println("call(double d) 메소드 호출...");
	}
	
	void call(String str, int i) {		
		System.out.println("call(String str, int i) 메소드 호출...");
	}
	
	void call(int i, String str) {		
		System.out.println("call(int i, String str) 메소드 호출...");
	}
	
	/*
	void call(char c) {		
		System.out.println("call(char c) 메소드 호출...");
	}
	*/
	
	void call(boolean b) {		
		System.out.println("call(boolean b) 메소드 호출...");
	}
}


public class MethodMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method m = new Method();
		m.call(); // 다른 메소드		
		m.call(10); // 묵시적 형변환(가까운 순서대로): char < int < double < ...
		m.call("Hello"); // 다른 메소드
		m.call(12.34);
		m.call("hello", 5);
		m.call(5, "hello");
		m.call('A'); // 묵시적 형변환(가까운 순서대로): char < int < double < ...
		m.call(true);

	}

}
