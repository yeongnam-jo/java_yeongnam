package kr.ac.yeongnam.day11;

public class ExceptionMain05 {

	public static void main(String[] args) {
		System.out.println("main starts...");
		System.out.println("============");
		
		for(int i = -2; i < 3; i++) {
			System.out.println("for문 진입...");
			System.out.println("i = [" + i + "]");
			
			try {
				System.out.println(10 / i);
								
			} catch(Exception e){
				e.printStackTrace();
				break;
			} finally { // break 지나왔지만, finally 무조건 실행되네.
				System.out.println("for문 종료...");
				System.out.println("============");				
			}
		}
		
		System.out.println("main ends...");
	}
}
