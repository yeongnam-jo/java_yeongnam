package kr.ac.yeongnam.day04.homework;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int[] nums = new int[30];
		System.out.print("1 - 100 사이의 정수를 입력하시오 : ");		
		int intNum = sc.nextInt();		
		
		int count = 0;		
		for(int i = 1; i <= intNum; i++) {
			if(intNum % i == 0) {
				nums[count] = i;
				count++;
			}
		}
		
		System.out.println(intNum + "의 약수의 개수 : " + count + "개");
		
		int[] factorArr = new int[count]; // 배열의 길이는 반드시 선언되어야 깊은 복사가 가능하다.
		System.arraycopy(nums, 0, factorArr, 0, count); // 깊은 복사 API
		
		System.out.println("< " + intNum + "의 " + count + "개 약수 출력 >");
		for(int num : factorArr) {
			System.out.print(num + " ");
		}
		
	}

}
