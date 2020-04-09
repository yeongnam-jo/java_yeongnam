package kr.ac.yeongnam.day02.homework;

/*
6. 알파벳이 모두 몇 자 인지 화면에 출력하시오.
      개수 ? 52 
 */

public class Problem6 {

	public static void main(String[] args) {
		String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int alphabetLength = alphabet.length(); // length 메소드로 문자열의 길이를 구함
		
		System.out.println("개수 : " + alphabetLength);		
	}
}
