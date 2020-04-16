package kr.ac.yeongnam.day04.homework;

import java.util.Scanner;

public class Problem03_review {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		
		for(int i = 0; i < nums.length; ) {
			System.out.print("num" + (i+1) + " : ");		
			nums[i] = sc.nextInt();
			sc.nextLine();
			
			// {5, 8, 11, 15, 20}
			// nums[0] = 5, nums[1] = 8
			// nums[2]는 5, 8보다 큰수
			
			if(i > 0 && nums[i-1] >= nums[i]) { // &&, || 연산자를 잘 쓰자.
				for(int j = 0; j < i; j++) {
					if(j != 0)
						System.out.print(", ");					
					System.out.print(nums[j]);
				}
				System.out.println("큰수를 입력하세요...");
				// for 조건에 i++ 있으면, 여기에 i--; 입력하면 됨. // 다시 입력받기 위해서..! wow
				
				
			} else {				
				i++; //for 간단하게 완성.
			}
		}
		
		System.out.println("< PRINT >");
		for(int num : nums) {
			System.out.print(num + "\t");
		}
		System.out.println();
		
		System.out.println("< REVERSE >");
		for(int i = nums.length-1; i >= 0; i--) {
			//정수가 2자리라는 가정하에 코드 작성
			// 정수의 자리수에 상관없이 출력되는 코드 작성
			int n10 = nums[i] / 10;
			int n1 = nums[i] % 10;
			System.out.print(n1 * 10 + n10 + "\t");
			//System.out.print(nums[i] + "\t");
		}
		System.out.println();

	}

}
