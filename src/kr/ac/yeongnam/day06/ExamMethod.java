package kr.ac.yeongnam.day06;

import java.util.Random;
import java.util.Scanner;

public class ExamMethod {

	int getSum(int a, int b) {
		
		return a+b;		
	}
	
	int getTotalSum(int a, int b) {
		int sum = 0;
		while(a <= b) {
			sum = sum + a++;
			
		}
		return sum;
	}
	
	int[] getNums() {
		
		int[] nums = getNums(100, 10);
		
		/*
		Random r = new Random();
		int[] nums = new int[10];
		
		for(int i = 0; i < nums.length; i++) {
			// nums[i] = r.nextInt(1) * 100; ==> 아니야!!!
			nums[i] = r.nextInt(100) + 1;
		}	
		return nums;	
		*/	
		
		return nums;
	}
	
	int[] getNums(int size) {
		
		int[] nums = getNums(100, size);
		/*
		Random r = new Random();	
		
		int[] nums = new int[size];
		
		for(int i = 0; i < nums.length; i++) {
			// nums[i] = r.nextInt(1) * 100; ==> 아니야!!!
			nums[i] = r.nextInt(100) + 1;
		}	
		*/
		return nums;				
	}
	
	int[] getNums(int max, int size) {
		Random r = new Random();
		int[] nums = new int[size];
		
		for(int i = 0; i < nums.length; i++) {
			// nums[i] = r.nextInt(1) * 100; ==> 아니야!!!
			nums[i] = r.nextInt(max) + 1;
		}	
		
		return nums;				
	}
	
	int getNum(){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		sc.nextLine();
		
		return size;
	}
}
