package kr.ac.yeongnam.day03.test;

import java.util.Scanner;

public class Problem2Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 3개를 입력하세요 : ");
		int firstInt = sc.nextInt();
		int secondInt = sc.nextInt();
		int thirdInt = sc.nextInt();
		// sc.nextLine(); // 더 이상 입력받을 일이 없으니..주석 처리 가능.
		
		if(firstInt < secondInt) {
			int tmp1 = firstInt;
			firstInt = secondInt;
			secondInt = tmp1;						
		}
				
		if(secondInt < thirdInt) {
			int tmp2;
			if(firstInt < thirdInt) {
				tmp2 = firstInt;
				firstInt = thirdInt;
				thirdInt = secondInt;
				secondInt = tmp2;
				
			} else {
				tmp2 = secondInt;
				secondInt = thirdInt;
				thirdInt = tmp2;				
			}
		}
		
		System.out.printf("%d %d %d", firstInt, secondInt, thirdInt);

	}

}
