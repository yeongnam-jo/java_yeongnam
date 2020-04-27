package kr.ac.yeongnam.day11;

import java.util.Random;

public class ExceptionMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main starts...");
		
		Random r = new Random();
		int num = r.nextInt(3);
		
		System.out.println("추출된 난수 : " + num);
		System.out.println(10 / num); // runtime exception 가능

		System.out.println("main end...");
	}

}
