package kr.ac.yeongnam.day04;

import java.util.Arrays;

public class ArrayMain02 {

	public static void main(String[] args) {
		// "폴리텍", "자바", "교육" 3개의 문자열을 저장하는 strArr 생성
		
		//String[] strArr = {"폴리텍", "자바", "교육"};
		String[] strArr = new String[5];
		
		/*
		 	 인덱스를 상수로 입력하면, 유지보수가 힘들다. 
		 	 1번 인덱스에 "광명"을 입력하려면, 괄호 안의 인덱스 번호를 일일이 연쇄적으로 수정해야 한다.
		 	 아래와 같이 하면, 한줄 삽입하면 끝난다.		 	 
		 */
		int loc = 0;		
		strArr[loc++] = "폴리텍";
		strArr[loc++] = "광명";
		strArr[loc++] = "자바";
		strArr[loc++] = new String("교육");
		
		
		// strArr[0] = "폴리텍"; // 아래와 차이가 있음!
		// strArr[1] = new String("자바");// 위와 차이가 있음
		
		
		/*
		 	 배열의 모든 요소를 출력하는 3가지 방식
		 	 1. index를 이용한 출력
		 	 2. 1.5 버전의 for문을 이용한 출력(foreach문)		 	 	
		 	 	for( 자료형 변수명 :  배열) {}
		 	 	===> 배열의 element 개수 만큼만 돈다.
		 	 	
		 	 3. Arrays.toString() 메소드를 이용한 출력
		 	    Arrays.toString(배열명) 
		 	    ===> "[첫번째 요소, 두번째요소, ... , 마지막요소]"
		 	    ===> 배열을 하나의 문자열로 묶어서 보여준다.   	 	 
		 	 
		 */
		
		
		// 1. index를 이용한 출력
		System.out.println("< 1. index를 이용한 출력 >");
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		// 2. 1.5 버전의 for문을 이용한 출력(foreach문)
		System.out.println();
		System.out.println("< 2. 1.5 버전의 for문을 이용한 출력(foreach문) >");
		for(String s : strArr) {
			System.out.println(s);
		}
		for(String s : strArr) {
			s = "Hello";
			System.out.println(s);
		}
		// 값이 입력되지는 않는 것 같다. 오로지 출력을 위한 형태(foreach문)
		for(String s : strArr) {
			System.out.println(s);
		}
		
		// 3. Arrays.toString() 메소드를 이용한 출력
		System.out.println();
		System.out.println("< 3. Arrays.toString() 메소드를 이용한 출력 >");
		System.out.println(Arrays.toString(strArr));

			
					
	}

}
