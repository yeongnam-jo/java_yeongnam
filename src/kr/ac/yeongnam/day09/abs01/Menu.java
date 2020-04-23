package kr.ac.yeongnam.day09.abs01;

import java.util.Scanner;

public class Menu {

	private Scanner sc;
	
	public Menu() {
		sc = new Scanner(System.in);
	}
	
	public void execute() {
		
		System.out.println("프린터를 선택하세요(1. LG 2. 삼성) => ");
		int type = sc.nextInt();
		sc.nextLine();
		
		if(type == 1) {
			LGPrinter lg = new LGPrinter();
			lg.lgPrint();
			lg.print(); // 부모클래스에 있는 함수
			lg.print(); // 오버라이딩 했음
			
		} else if(type == 2) {
			SamsungPrinter sam = new SamsungPrinter();
			sam.samPrint();
			sam.print(); // 부모클래스에 있는 함수
			
		} else {
			System.out.println("잘못 선택했습니다.");
		}
		
	}
}
