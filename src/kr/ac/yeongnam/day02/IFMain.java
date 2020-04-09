package kr.ac.yeongnam.day02;

import java.util.Scanner;

/*
 * 	기상;
 *  (밥먹고)
 *  학교간다
 */


public class IFMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("기상한다");
		
		System.out.println("\t집에서 출발한 시간을 입력: ");
		int wakeTime3 = sc.nextInt();
		sc.nextLine();
		
		if(wakeTime3 < 800) {
			System.out.println("걸어서");
		} else if(wakeTime3 < 815) {
			System.out.println("버스타고");
		} else {
			System.out.println("택시타고");
		}
		
		System.out.println("학교간다.");
		
		
		/*
		System.out.println("기상한다");
		
		System.out.println("\t집에서 출발한 시간을 입력: ");
		int wakeTime2 = sc.nextInt();
		sc.nextLine();	
		
		System.out.println(wakeTime2 >= 800 ? "버스타고":"걸어서");	//3항 연산자(조건연산자)			
		*/
		
		/*
		if(wakeTime2 < 800) {
			System.out.println("걸어서");

		} else {
			System.out.println("버스타고");
		}
		System.out.println("학교간다");
		*/
		
		
		/*
		System.out.println("기상한다");
		
		System.out.println("일어난 시간을 입력(7시10분 710입력): ");
		int wakeTime = sc.nextInt(); 
		sc.nextLine(); //버퍼를 비워주기 위한 작업
		
		// 일어나는 시간이 7시 이전이면 밥먹고, 아니면 그냥 간다.
		if(wakeTime < 700) {
			System.out.println("밥먹고");			
		}
				
		System.out.println("학교간다");
		
		*/
	}

}
