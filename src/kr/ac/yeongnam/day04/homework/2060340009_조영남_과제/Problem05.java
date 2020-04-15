package kr.ac.yeongnam.day04.homework;

/*
 	5. 2 ~ 100사이의 소수를 출력하는 코드를 작성 
 	
 	< 2 ~ 100사이의 소수 출력 > 
 	2  3  5  7  11 13  17 … 97 
 */

public class Problem05 {

	public static void main(String[] args) {

		// 2~100 사이의 정수를 배열에 담는다.
		int[] intArr = new int[99];
		for(int i = 0; i < 99; i++) {
			intArr[i] = i+2;
		}
		
		// 배열을 돌면서 소수인지 판별한다.
		for(int num : intArr) {
			int count = 0;
			for(int i = 1; i <= num; i++) {
				if(num % i == 0) {
					count++;
				}				
			}	
			
			if(count == 2) { // 소수일 때, 그 소수의 배수들은 모두 0으로 초기화			
				int times = 2;
				while(num * times <= 100) {
					intArr[num * times -2] = 0;
					times++;
				}
				
			} else { // 소수가 아닐 때, 해당 수는 0으로 초기화
				if(num >= 2) {
					intArr[num-2] = 0;					
				}			
			}
		}
				
		System.out.println("< 2 ~ 100 사이의 소수 출력 >");
		for(int i = 0; i < intArr.length; i++) {
			if(intArr[i] != 0) { // 배열 안의 값이 0이 아닌 경우에만 출력
				System.out.print(intArr[i] + " ");
			}
		}
	}
}
