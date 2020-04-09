package kr.ac.yeongnam.day02.test;

import java.util.Scanner;

public class NumberToAscii {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("아스키코드로 변환할 숫자를 입력하세요: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		//char ascii = num;
		
		char ascii = (char) num;
		System.out.println("변환된 값은 " + ascii + "입니다.");
	}

}
