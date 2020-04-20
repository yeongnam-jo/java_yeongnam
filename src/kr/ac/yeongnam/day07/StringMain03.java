package kr.ac.yeongnam.day07;

import java.util.Arrays;

public class StringMain03 {

	public static void main(String[] args) {

		String str = "hello world";
		char c = 'r';
		// r의 위치를 알고싶다?		
		System.out.println(c + "의 검색된 위치 : " + str.indexOf(c));
		
		// l의 위치를 알고싶다?
		c = 'l';
		System.out.println(c + "의 검색된 위치 : " + str.indexOf(c));
		System.out.println(c + "의 검색된 위치 : " + str.indexOf(c, 4));
	
		// p를 검색해볼까? => 없으면 -1 반환.
		c = 'p';
		System.out.println(str.indexOf(c));
		
		// l 인덱스를 모두 반환해보자
		str = "helLo world";
		String searchStr = "l";
		System.out.println("< " + str + "에서\"" + searchStr + "\" 위치 >");
		int searchIdx = str.indexOf(searchStr);
		while(searchIdx != -1) {
			System.out.println("검색된 위치: " + searchIdx);
			searchIdx = str.indexOf(searchStr, searchIdx+1);
		}
			
		
		// l 인덱스를 모두 반환해보자
		System.out.println("< " + str + "에서\"" + searchStr + "\" 위치 >");
		searchIdx = -1;
		while((searchIdx = str.indexOf(searchStr, searchIdx+1)) != -1) {
			System.out.println("검색된 위치: " + searchIdx);			
		}
		
		// substring
		System.out.println();
		System.out.println("==== substring ====");
		str = "hello world";
		System.out.println("substring(2) : " + str.substring(2));
		System.out.println("substring(2, 7) : " + str.substring(2, 7));
		
		// concat => + 역할임.
		System.out.println();
		System.out.println("==== concat ====");
		String strA = "good";
		String strB = "bye!!";
			
		str = strA.concat(strB); //str = strA + strB;
		System.out.println("str : " + str);
		
		// trim
		System.out.println();
		System.out.println("==== trim ====");
		str = "            hello    world        ";
		System.out.println("[" + str + "]의 길이 : " + str.length());
		System.out.println("[" + str.trim() + "]의 길이 : " + str.length());
		str = str.trim();
		System.out.println("[" + str + "]의 길이 : " + str.length());
		
		// split
		System.out.println();
		System.out.println("==== split ====");
		str = "홍길동전:허균:조선시대";
		System.out.println("str : " + str);
		
		String[] strArr = str.split(":"); // split의 return 타입이 배열이니까!
		System.out.println(Arrays.toString(strArr));
		
		strArr = str.split(",");
		System.out.println(Arrays.toString(strArr));
		
		String date = "2020-04-20";
		String[] dateArr = date.split("-");
		System.out.println(Arrays.toString(dateArr));
		
		System.out.println();
		System.out.println("==== valueOf ====");
		int num = 12345;
		System.out.println(num + "" + 100); // String으로 형변환 하기 위한 꼼수 ""
		System.out.println(String.valueOf(num) + 100);
		
		
		System.out.println("==== Integer.valueOf ====");
		System.out.println(Integer.valueOf("12")); // Integer 타입
		int n = Integer.valueOf("12"); // Integer 타입이지만, int로 받을 수 있음
		System.out.println(Integer.parseInt("12")); // int 타입
		
		
	}

}
