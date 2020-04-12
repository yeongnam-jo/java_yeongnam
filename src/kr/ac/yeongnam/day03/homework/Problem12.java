package kr.ac.yeongnam.day03.homework;


/*
 	12. 다음의 결과를 보이는 코드를 작성하시오. (단 출력메소드에 하나의 문자만 가능) 
 
      *-------*       
      **-----**       
      ***---***
      ****-****       
      *********       
      ****-****       
      ***---***       
      **-----**       
      *-------* 
 */

public class Problem12 {

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) { // 1행부터 5행까지 반복
			for(int j = 1; j <= 9; j++) {
				if(j < 5) { // 1열부터 4열까지의 규칙
					if(i >= j) {
						System.out.print("*");
					} else {
						System.out.print("-");
					}
				} else { // 5열부터 9열까지의 규칙
					if(10-i <= j) {
						System.out.print("*");
					} else {
						System.out.print("-");
					}					
				} 
			}
			System.out.println("");
		}
		
		for(int i = 1; i <= 4; i++) { // 6행부터 9행까지 반복
			for(int j = 1; j <= 9; j++) {
				if(j < 5) { // 1열부터 4열까지의 규칙
					if(6-j <= i) {
						System.out.print("-");
					} else {
						System.out.print("*");
					}
				} else { // 5부터 9열까지의 규칙
					if(i >= j-4) {
						System.out.print("-");
					} else {
						System.out.print("*");
					}					
				}
			}
			System.out.println("");			
		}
	}
}
