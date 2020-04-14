package kr.ac.yeongnam.day04.homework;

public class Problem05미완료 {

	public static void main(String[] args) {

		int[] intArr = new int[99];
		for(int i = 0; i < 99; i++) {
			intArr[i] = i+2;
		}
		// 어차피 intArr[0] ==2 이므로, 소수이다.
		// 그럼, 
		// 아 아니다...문제 풀라는 가이드가 있다. 그걸 따라해야 함.
		for(int i = 1; i < intArr.length; i++) {
			for(int j = 2; j < intArr[i]; j++) {
				
			}
			//intArr[i] 
			
//			if(intArr[i]  소수이면) {
//				// intArr의 배수들은 모두 0으로 초기화
//			} else {
//				// intArr[i] = 0;
//			}
		}

		System.out.println("< 2 ~ 100 사이의 소수 출력 >");
		for(int i = 0; i < intArr.length; i++) {
			if(intArr[i] == 0) {
				
			} else {
				System.out.print(intArr[i] + " ");
			}
		}
	}

}
