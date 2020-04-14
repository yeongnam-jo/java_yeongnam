package kr.ac.yeongnam.day04.homework;

import java.util.Scanner;

public class Problem03미완료 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] intArr = new int[5]; 
		for(int i = 0; i < 5; i ++) {
			System.out.print((i+1) + "번째 정수 : ");
			intArr[i] = sc.nextInt();									
			
			if( i >= 1) {
				while(intArr[i-1] >= intArr[i]) {
					// 0 ~ i-1 까지의 element에 있는 요소들을 콤마로 나열해야 함.
					System.out.printf("%4d", intArr[0]);
					
					for(int j = 1; j < i; j++) {
						System.out.print(", " + intArr[j]);						
					}

					System.out.println("보다 큰수가 와야합니다.");					
					System.out.print((i+1) + "번째 정수 : ");
					intArr[i] = sc.nextInt();								
				}				
			}
			
		}
		
		System.out.println();
		System.out.println("< PRINT >");
		for(int num : intArr) {
			System.out.print(num + " ");
		}
		
		//REVERS 풀어야함.
		// 15 
		int [] reverseArr = new int [intArr.length];
		
		for(int i = (intArr.length - 1); i >= 0; i--){
			//int tmp = intArr[i];
			
			//for(int j = 1; )
			//intArr[i]
			
			//int digit = 0;
			
			
									
			
		}
		
	}

}
