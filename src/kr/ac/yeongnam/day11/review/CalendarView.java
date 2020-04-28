package kr.ac.yeongnam.day11.review;

import java.util.Scanner;

public class CalendarView {

	private Scanner sc;
	private CalendarUtil util;
	
	
	public CalendarView() {
		sc = new Scanner(System.in);
		util = new CalendarUtil();
	}
	
	public int scanInt(String msg) {
		System.out.println(msg);
		sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		
		return num;
		
	}
	
	public void execute() {
		
		loop : while(true) {
			int no = scanInt("항목을 선택하세요(1. 연도   2. 월   3. 종료) => ");
			
			int year = 0, month = 0;
			switch(no){
			case 1:
				System.out.println("1번 선택");
				year = scanInt("연도를 입력하세요 : ");
				util.showByYear(year);
				break;
			case 2:
				System.out.println("2번 선택");
				year = scanInt("연도를 입력하세요 : ");
				month = scanInt("월을 입력하세요");
				util.showByMonth(year, month);
				break;
			case 3:
				System.out.println("3번 선택");
				// break loop;
				System.exit(0); // 프로그램을 종료하는 메소드, 0은 정상종료
			
			}
		}
	}
}
