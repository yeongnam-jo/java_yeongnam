package kr.ac.yeongnam.day02;

import java.util.Scanner;

public class ScannerMain02 {
	
	public static void main(String[] args) {
		/*
		 * 문자열을 입력: hello world
		 * 정수를 입력: 123
		 * 문자열: hello world  , 정수: 123
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력: ");
		String str = sc.nextLine();
		
		System.out.println("정수를 입력: ");
		int num = sc.nextInt();
		
		System.out.println("문자열: " + str + ", 정수: " + num);
		
		
		/*
		 * 정수를 입력: 123
		 * 문자열을 입력: hello world
		 * 문자열: ,   정수: 123
				 		
		System.out.println("문자열을 입력: ");
		String str = sc.nextLine();
		
		System.out.println("정수를 입력: ");
		int num = sc.nextInt();
		
		System.out.println("문자열: " + str + ", 정수: " + num);
		
		*/
		
	}

}
