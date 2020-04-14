package kr.ac.yeongnam.day04.homework;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] intArr = new int[10];		
		for(int i = 0; i <= 9; i++) {
			System.out.print((i+1) + "'s num : ");
			intArr[i] = sc.nextInt();
		}
				
		String strEven = "";
		String strOdd = "";
		
		int sumEven = 0;
		int sumOdd = 0;
		
		for(int num : intArr) {
			if(num % 2 == 0) {
				sumEven = sumEven + num;
				strEven = strEven + Integer.toString(num) + " ";
			} else {
				sumOdd = sumOdd + num;
				strOdd = strOdd + Integer.toString(num) + " ";
			}
		}
		
		System.out.println("< 짝수 >");
		System.out.println(strEven);
		System.out.printf("짝수의 총합 : %d", sumEven);
		System.out.println();		
		System.out.println("< 홀수 >");
		System.out.println(strOdd);
		System.out.printf("홀수의 총합 : %d", sumOdd);	
		
	}

}
