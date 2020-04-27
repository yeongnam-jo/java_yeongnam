package kr.ac.yeongnam.day11;

import java.util.Random;

public class ExceptionMain02 {
	public static void main(String[] args) {
		
		System.out.println("main starts...");
		
		
		try {
			Random r = new Random();
			int num = r.nextInt(3);
			System.out.println("추출된 난수 : " + num);
			System.out.println(10 / num); // runtime exception 가능
			
		} catch(ArithmeticException ae) {
			System.out.println("예외 발생");
			System.out.println("발생 이유 : " + ae.getMessage());
			ae.printStackTrace();
		}

		System.out.println("main end...");
	}
}
