package kr.ac.yeongnam.day06;

import java.util.Scanner;

/**
 * 구구단과 관련된 기능을 가지고 있는 기능클래스
 * @author socra
 *
 */

public class Gugudan {
	
	/**
	 * 키보드로 하나의 단을 입력받아 호출자 메소드에게 넘겨주는 기능
	 */
	int getDan(){
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		sc.nextLine();
		
		return dan;		
	}
	
	int getDan(String msg) {
		System.out.print(msg);	
		
		/*
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		sc.nextLine();
		*/
		
		int dan = getDan();
		
		return dan;		
	}
	
	/**
	 * 호출자가 출력할 단을 넘겨주면 그 단의 구구단을 출력
	 * @param dan 출력할 단
	 */
	void print(int dan) {
		System.out.println("*** " + dan + "단 ****");
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
			System.out.println();
		}
	}
	
	
	/**
	 * 2 ~ 9단까지의 구구단을 출력
	 */	
	void print() {		
		// 같은 클래스에 있는 메소드니까, 메소드를 바로 호출할 수 있음!
		// print(2);			
		
		/*
		for(int dan = 2; dan <= 9; dan++) {
			print(dan);			
		}
		*/		
		
		print(2, 9);
	}
	
	/**
	 * 시작 단에서부터 종료단 까지의 구구단을 출력
	 * @param start 시작단
	 * @param end   종료단
	 */
	void print(int start, int end) {

		for(int dan = start; dan <= end; dan++) {
			print(dan); // 같은 클래스 내의 메소드는 바로 호출 가능.			
		}		
	}
}
