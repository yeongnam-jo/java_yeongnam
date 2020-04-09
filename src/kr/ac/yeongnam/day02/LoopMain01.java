package kr.ac.yeongnam.day02;

import java.util.Random;
import java.util.Scanner;

/*
	운동장 한바퀴 뛴다
	4바퀴 남았습니다.
	운동장 한바퀴 뛴다
	3바퀴 남았습니다.
	운동장 한바퀴 뛴다
	2바퀴 남았습니다.
	운동장 한바퀴 뛴다
	1바퀴 남았습니다.
	운동장 한바퀴 뛴다	
	다뛰었습니다.
 */
public class LoopMain01 {

	public static void main(String[] args) {
		
		final int GOAL = 5;
		for(int count = 1; count <= GOAL; count++) {// 목표치보다 적게 뛰었나?			
			System.out.println("운동장 한바퀴 뛴다.");
			if((GOAL-count) > 0) { //goal-count) != 0
				System.out.println((GOAL-count) + "바퀴 남았습니다.");				
			} else {
				System.out.println("다 뛰었습니다.");
			}						
		}		
		
		for(int count2 = 1; count2 <= 10; count2++) {
			System.out.println("Hello "+ count2);			
		}
		
		System.out.println("숫자 맞추기 게임을 해봅시다.");
		
		Random r = new Random();
		int randomNum = r.nextInt(11);
		
		Scanner sc = new Scanner(System.in);
		int guessNum = sc.nextInt();
		sc.nextLine();
		
		while(true) {
			System.out.println("1~10 사이의 정수를 입력하세요: ");
			
			if(randomNum == guessNum) {
				System.out.println("숫자를 맞췄습니다. 정답은 " + randomNum + "입니다.");
				break;
				
			} else {
				System.out.println("다시 맞춰 보세요.");
			}			
		}

		

		
		
		
		
		
		
		/* while 반복문 활용
		final int GOAL = 5;
		int count = 1;
		
		while(count <= GOAL) { // 목표치보다 적게 뛰었나?
			System.out.println("운동장 한바퀴 뛴다.");
			if((GOAL-count) > 0) { //goal-count) != 0
				System.out.println((GOAL-count) + "바퀴 남았습니다.");				
			} else {
				System.out.println("다 뛰었습니다.");
			}
			count++;
		}
		
		*/


	}

}
