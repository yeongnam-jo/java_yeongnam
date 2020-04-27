package kr.ac.yeongnam.day11;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionMain06 {

	static void a() throws NullPointerException {
		String str = "hello";
		
		try {
			
			System.out.println("2번째 문자: " + str.charAt(1));
			System.out.println("6번째 문자: " + str.charAt(5));
		} catch(Exception e ) {
			e.printStackTrace();
		}
	}
	
	static void b() throws FileNotFoundException {
		// 호출하는 쪽으로 예외를 던져버리기!
		// 내가 안한다. 쓰려면 니가해라!!
		FileReader fr = new FileReader("a.txt");
	}
	
	
	public static void main(String[] args) /*throws FileNotFoundException */ {
		
		System.out.println("main starts...");
		a();
		
		try {
			
			b();
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("main ends...");
	}
}
