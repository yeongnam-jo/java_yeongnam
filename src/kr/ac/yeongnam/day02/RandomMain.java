package kr.ac.yeongnam.day02;

// import java.util.* => 모든 패키지 임포트(속도가 느리겠죠?)
import java.util.Random;
import java.util.Scanner;

public class RandomMain {

	public static void main(String[] args) {
		// java.util.Random r = new java.util.Random();
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int random = r.nextInt(); // 임의의 정수 추출
		System.out.println(random);
		
		// 0~9 사이의 난수를 추출
		int num = r.nextInt(10); // 0부터 10개의 양수 중 랜덤 추출
		System.out.println("num = " + num);
		
		// 1~10 사이의 난수 추출
		int num2 = r.nextInt(10) + 1;
		System.out.println(num2);
		
		// 10~ 99 사이의 난수 추출
		int num3 = r.nextInt(90) + 1;
		
		

	}

}
