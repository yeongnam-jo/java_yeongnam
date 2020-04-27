package kr.ac.yeongnam.day11;

import java.util.Scanner;


/*
 * throw 예제
 * 
 */
public class ExceptionMain07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		try {
			System.out.println("짝수를 입력하세요 : ");
			int num = sc.nextInt();			
			if(num % 2 == 1) {
				// throw new Exception("짝수만 가능합니다(입력받은 정수 : " + num + ")");
				throw new OddException("짝수만 가능합니다(입력받은 정수 : " + num + ")");
			} 			
			System.out.println("입력받은 짝수 : " + num);			
		} catch(OddException oe) {
			oe.printStackTrace();
		}
		/*
		catch(Exception e) {
			e.printStackTrace();			
		}
		*/
		
		
	
		
		
		/*
		if(num % 2 == 1) {
			System.out.println("홀수 입니다. 짝수를 입력하삼.");
		} else {
			System.out.println("입력받은 짝수 : " + num);			
		}
		*/
	}
}
