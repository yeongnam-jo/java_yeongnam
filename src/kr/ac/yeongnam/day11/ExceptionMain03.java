package kr.ac.yeongnam.day11;

import java.util.Random;

public class ExceptionMain03 {
public static void main(String[] args) {
		
		System.out.println("main starts...");
		
		
		try {
			Random r = new Random();
			int num = r.nextInt(3);
			System.out.println("추출된 난수 : " + num);
			System.out.println(10 / num); // runtime exception 가능
			
			String str = "hello";
			System.out.println("5번째 문자 : " +str.charAt(5));
			
				
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		/*
		catch(ArithmeticException | StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		*/
		
		/*
		catch(ArithmeticException ae) {
			System.out.println("ArithmeticException 발생");
			System.out.println("발생 이유 : " + ae.getMessage());
			ae.printStackTrace();
		} catch(StringIndexOutOfBoundsException se) {
			System.out.println("StringIndexOutOfBoundsException 발생");
			se.printStackTrace();
		}
		*/
		
		System.out.println("main end...");
	}
}
