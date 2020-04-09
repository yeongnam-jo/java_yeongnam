package kr.ac.yeongnam.day02;

import java.util.Scanner;

public class SwitchMain02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("좋아하는 계절은 무엇인가요: ");
		String season = sc.nextLine();
		System.out.println(season);
		
		if(season.equals("봄")) {
			System.out.println("가장 좋아하는 계절은 " + season + "입니다.");
		}
		

	}

}
