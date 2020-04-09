package kr.ac.yeongnam.day01;

import java.util.Scanner;

/*
 * Scanner 클래스
 *  키보드를 통해 정수, 실수, 논리값, 문자열을 입력받는 기능을 제공하는 클래스
 */


public class ScannerMain {
	
	public void babo() {
		
	}

	public static void main(String[] args) {

		/*
		 * Scanner 에는 기본적인 버그가 있다. 버퍼가 있어서, 기존에 입력한 값이 자동으로 넘어갈 수도 있다.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		// java.util.Scanner sc = new java.util.Scanner(System.in);
		
		
		//String name = sc.next(); //단어 단위로 입력받음. 띄어쓰기하면 공백문자 이전까지만 받는다.
		System.out.print("이름을 입력하세요: ");
		String name = sc.nextLine(); //문장 단위로 입력받음.
		System.out.println("입력하신 문자열은" + name + "입니다.");		
		
		System.out.print("정수를 입력해주세요: ");
		int num = sc.nextInt(); //뭘입 력받으려면 next를 쓴다.
		System.out.println("입력하신 정수는 " + num + "입니다."); //아래 콘솔창에서 terminated 라고 안떴다. 프로그램이 실행중이란 소리임.
		// 콘솔에 숫자를 써줘야 끝난다.
		
		System.out.print("true/false 중 하나를 입력하세요: ");
		boolean bool = sc.hasNextBoolean();
		System.out.println(bool + "을/를 입력하셨습니다.");
		

		
	}

}
