package kr.ac.yeongnam.day04.homework;

public class Problem05_review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[99];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = i+2;
		}
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != 0) { // 소수라면
				for(int j = i+1; j < nums.length; j++) {
					if(nums[j] % nums[i] == 0) {
						nums[j] = 0;
					}
				}
				
			}
		}
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != 0) {
				System.out.printf("%5d", nums[i]);
			}
		}
		System.out.println();
				
	}

}
