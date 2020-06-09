package kr.ac.yeongnam.board.ui;

import java.util.Scanner;

public abstract class BaseUI implements IBoardUI {

	
	private Scanner sc;
	
	public BaseUI() {
		sc = new Scanner(System.in);
	}
	
	public int scanInt(String msg) {
		System.out.println(msg);
		
		return Integer.parseInt(sc.nextLine());		
		
	}
	
	
	public String scanStr(String msg) {
		System.out.println(msg);
		return sc.nextLine();
	}
	
	
	
}
