package kr.ac.yeongnam.day05;

/*
 	**********
 	Hello
 	**********
 	Hi
	**********
	Goodbye
 	**********
 	
 */

public class MethodMain01 {

	/*
	static void printStar() {

		for(int i = 0; i < 10; i++) {
			System.out.print("*");
		}
		System.out.println("");
	}
	*/

	static void printStar(int cnt) {
		
		for(int i = 0; i < cnt; i++) {
			System.out.print("*");
		}
		System.out.println("");
	}
	
	static int factorial(int n) {
		int result = 1;
		for(int i = n; i >= 1; i--) {
			result = result * i ;			
		}
		
		return result;
	}
	
	
	static void printStar2(char c, int cnt) {
		for(int i = 0; i < cnt; i++) {
			System.out.print(c);
		}		
		System.out.println();
	}
	
		
	public static void main(String[] args) {
		int result = factorial(3);
		System.out.println(result);
		
		
		int i = 100;
		System.out.println(i);
		System.out.println("============");
		printStar(10); 
		// 여기서, main 메소드가 호출자 메소드
		// printStar 메소드를 피호출자 메소드.
		
		printStar2('#', 5);
		printStar2('&', 10);
		
		System.out.println(i);
		System.out.println("Hello");
		printStar(5);
		System.out.println("hi");
		printStar(20);		
		System.out.println("goodbye");
		printStar(12);
		
		
	}

}
