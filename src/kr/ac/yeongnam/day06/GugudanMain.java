package kr.ac.yeongnam.day06;

import java.util.Scanner;

public class GugudanMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Gugudan gu = new Gugudan();
		
		// System.out.print("2 - 9 사이의 단을 입력 : ");
		// int dan = gu.getDan(); // int dan = Integer.parseInt(sc.nextLine());

		int dan = gu.getDan("2 - 9 사이의 단을 입력 : ");
		
		
		
		gu.print(dan); // 메소드 오버로딩
		
		System.out.println("==========");
		System.out.println("==========");
		System.out.println("==========");
		System.out.println("==========");
		
		gu.print(); // 메소드 오버로딩
		// 매개변수만 다르면, 다른 기능의 메소드가 실행된다.
		// gu.printAll(); 이렇게, 다 다른 메소드명을 하면 기억하기 어렵다.
		
		
		System.out.println("==========");
		System.out.println("==========");
		System.out.println("==========");
		System.out.println("==========");
		
		System.out.print("시작단을 입력 : ");
		int startDan = gu.getDan();
		
		System.out.print("종료단을 입력 : ");
		int endDan = gu.getDan();
		
		gu.print(startDan, endDan);
		
	}
}
