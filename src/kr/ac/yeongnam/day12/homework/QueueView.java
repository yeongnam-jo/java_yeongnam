package kr.ac.yeongnam.day12.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QueueView {

	private Scanner sc;
	
	QueueView(){
		List<String> queue = new ArrayList<>();
	}
	
	public void start() {
		
		int num = select();
		switch(num) {
		case 1:
			add();
			break;
		case 2:
			remove();
			break;
		case 3:
			printAll();
			break;
		case 4:
			System.out.println("종료합니다.");
		}
		
	}
	
	public int select() {
		sc = new Scanner(System.in);
		
		System.out.println("< QUEUE >");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 삭제");
		System.out.println("3. 전체 데이터 출력");
		System.out.println("4. 종료");
		
		int num = sc.nextInt();
		sc.nextLine();
		
		return num;
	}
	
	public void add() {
		
	}
	public void remove() {
		
	}
	public void printAll() {
		
	}
}
