package kr.ac.yeongnam.day09.abs02;

import java.util.Scanner;

public class Menu {

	private Scanner sc;
	
	public Menu() {
		sc = new Scanner(System.in);
	}
	
	public void execute() {
		
		System.out.println("프린터를 선택하세요v2(1. LG 2. 삼성 3. HP) => ");
		int type = sc.nextInt();
		sc.nextLine();
		
		//Step 3
		Printer p = null;
		if(type == 1) {
			p = new LGPrinter();			
			
		} else if(type == 2) {
			p = new SamsungPrinter();
			
		} else if(type == 3){
			p = new HPPrinter();			
		}
		p.print();
		
		/*
		 * Step 2
		if(type == 1) {
			Printer lg = new LGPrinter();
			// lg.lgPrint();
			lg.print(); // 부모클래스에 있는 함수
			lg.print(); // 오버라이딩 했음
			
		} else if(type == 2) {
			SamsungPrinter sam = new SamsungPrinter();
			sam.samPrint();
			sam.print(); // 부모클래스에 있는 함수
			
		} else if(type == 3){
			HPPrinter hp = new HPPrinter();
			hp.print();
		}
		*/
		
		/*
		 * Step 1
		if(type == 1) {
			LGPrinter lg = new LGPrinter();
			lg.lgPrint();
			lg.print(); // 부모클래스에 있는 함수
			lg.print(); // 오버라이딩 했음
			
		} else if(type == 2) {
			SamsungPrinter sam = new SamsungPrinter();
			sam.samPrint();
			sam.print(); // 부모클래스에 있는 함수
			
		} else if(type == 3){
			HPPrinter hp = new HPPrinter();
			hp.print();
		}
		
		*/
			
	}
}
