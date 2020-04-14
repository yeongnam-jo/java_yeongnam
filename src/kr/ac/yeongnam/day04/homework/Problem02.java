package kr.ac.yeongnam.day04.homework;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int cnt = 1;
		int[] evenArr = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.print((i+1) + "'s num : ");
			evenArr[i] = sc.nextInt();								
			
			while(evenArr[i] % 2 != 0) {
				System.out.print((i+1) + "'s num : ");
				evenArr[i] = sc.nextInt();								
			}			
		}
		
		System.out.println();
		System.out.println("< 5개의 정수 출력 >");
		for(int num : evenArr) {
			System.out.printf("%d ", num);
		}		

	}

}
