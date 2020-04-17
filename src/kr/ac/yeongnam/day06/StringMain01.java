package kr.ac.yeongnam.day06;

import java.util.Arrays;

public class StringMain01 {

	public static void main(String[] args) {

		// String의 생성자(Constructor) 상당히 많다. document 찾아보자!
		// 배열을 파라미터로 입력받는 경우도 있다. 아래의 chars 를 보자.
		
		String str = new String();
		String str2 = new String("Hello World");
		
		char[] chars = {'A', 'B', 'C', 'D', 'E'};
		String str3 = new String(chars);
		String str4 = new String(chars, 1, 3);
		
		System.out.println("str : [" + str + "], length : " + str.length());
		System.out.println("str2 : [" + str2 + "]" + str2.length());
		System.out.println("chars : " + Arrays.toString(chars));
		System.out.println("str3 : [" + str3 + "], length : " + str3.length());
		System.out.println("str4 : [" + str4 + "], length : " + str4.length());
		
		
		// str4.charAt(0) ~ str4.charAt(str4.length()-1)
		// 배열의 길이는... strArr.length 이렇게 하는데,
		// String의 길이는... str.length() 이렇게 하네.
		
		// 문자열에서 문자를 추출할 때
		System.out.println("str4의 1번째 문자 " + str4.charAt(0));
		System.out.println("str4의 2번째 문자 " + str4.charAt(1));
		System.out.println("str4의 3번째 문자 " + str4.charAt(2));
		// System.out.println("str4의 3번째 문자 " + str4.charAt(3)); // String index out of range : 3
		
		// 문자열에서 문자를 추출할 때
		str = "Hello World!!";
		chars = new char[15];
		
		// str.getChars(0, 5, chars, 0);
		str.getChars(0, 5, chars, 3);
		System.out.println("=======");
		System.out.println(chars[0]);
		System.out.println("chars : " + Arrays.toString(chars));
		System.out.println(chars[1]); // 안나옵니다. 에러도 안나네.
		System.out.println(chars);
		
		
		
		
		
	}

}
