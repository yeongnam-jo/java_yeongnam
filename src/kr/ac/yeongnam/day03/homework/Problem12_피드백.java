package kr.ac.yeongnam.day03.homework;

public class Problem12_피드백 {

	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			if(i < 5) { // 1 ~ 4행 규칙
				for(int j = 1; j <= 10; j++) {
					if(i >= j || (10-i) <= j) {
						System.out.print("*");						
					} else {
						System.out.print("_");
					}
				}
				System.out.println();
				
			} else { // 5 ~ 9행 규칙
				for(int j = 1; j <= 10; j++) {
					if((10-i) >= j || i <= j) {
						System.out.print("*");						
					} else {
						System.out.print("_");
					}
				}
				System.out.println();
			}
		}	
	}
}
