package kr.ac.yeongnam.day11;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionMain04 {

	public static void main(String[] args) {
		
		System.out.println("main starts...");
		
		// 컴파일 시점의 예외
		try {
			System.out.println("==== check point 1 ====");
			FileReader fr = new FileReader("aaa.txt");
			System.out.println("==== check point 2 ====");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("예외 발생 유무에 상관없이 무조건 실행");
		}
		
		System.out.println("main ends...");
		
	}
}
