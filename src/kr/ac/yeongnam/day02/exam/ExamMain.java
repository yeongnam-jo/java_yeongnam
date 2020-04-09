package kr.ac.yeongnam.day02.exam;

import java.util.Scanner;

/*
	exam 패키지는 숙제가 아님. 한번 해보면 좋은 문제들!
	homework 패키지에 과제가 있음!

	보유하고 있는 책 권수를 입력 : 1
	1 book
	
	보유하고 있는 책 권수를 입력 : 2
	2 book
	
	보유하고 있는 책 권수를 입력 : -4
	잘못 입력하셨습니다.

 */

public class ExamMain {

	public static void main(String[] args) {
		
		System.out.println("보유하고 있는 책 권수를 입력: ");
		Scanner sc = new Scanner(System.in);
		int books = sc.nextInt();
		sc.nextLine(); //버퍼 버그를 해결하기 위함
		
		if(books >= 0) {
			System.out.println(books + " book");
			
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}		

	}

}
