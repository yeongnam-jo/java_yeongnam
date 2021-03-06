package kr.ac.yeongnam.day03.homework;

import java.util.Random;
import java.util.Scanner;
/*
	4. 다음의 결과를 보이는 프로그램 작성하시오.
	   1 - 100 사이의 정수를 입력 : 40
	   2 - 10사이의 정수를 입력 : 5
	   
	   < 1 ~ 40사이의 5의 배수를 제외한 정수 출력>
	    1  2  3  4  6  7  8  9  11 ... 39
	    
	   < 1 ~ 40사이의 5의 배수를 제외한 정수 5개씩 출력>      
	   1  2  3  4  6      
	   7  8  9  11 12      
	   ...  
	   
 */

public class Problem04 {

	public static void main(String[] args) {

		/*
		 * 답안01 => 내 답이랑 똑같네!
		Random r = new Random();
		int num = r.nextInt(10) + 1;
		
		System.out.println("< 1 ~ 100 사이의 정수 중" + num + "배수 제외>");
		for(int i = 1; i <= 100; i++) {
			if(i % num != 0) {
				System.out.printf("%5d", i);
			}
		}
		
		System.out.println("배수 제외 한라인 5개씩");
		int cnt = 0;
		...
		*/		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1-100 사이의 정수를 입력 : ");
		int MAX_INT = sc.nextInt();
		sc.nextLine(); //버퍼 버그를 방지하기 위한 코드
		
		System.out.print("2-10 사이의 정수를 입력 : ");
		int TIMES_INT = sc.nextInt();
		sc.nextLine(); //버퍼 버그를 방지하기 위한 코드
		
		System.out.printf("\n<1 ~ %d 사이의 %d의 배수를 제외한 정수 출력>\n", MAX_INT, TIMES_INT);
		for(int cnt = 1; cnt <= MAX_INT; cnt++) {
			if(cnt % TIMES_INT != 0) { // 배수가 아닌 경우에만 출력
				System.out.printf("%d ", cnt);				
			}									
		}		
		System.out.println(""); // 이 코드는 System.out.println(); 이랑 똑같다! 
		System.out.printf("\n<1 ~ %d 사이의 %d의 배수를 제외한 정수 5개씩 출력>\n", MAX_INT, TIMES_INT );
		
		int count = 1; // 출력된 정수의 갯수를 담고 있는 변수
		for(int cnt = 1; cnt <= MAX_INT; cnt++) {
			if(cnt % TIMES_INT != 0) { // 배수가 아닌 경우에만 출력
				System.out.printf("%3d", cnt);	// 3칸을 할당하고, 오른쪽 정렬
				//System.out.printf("%-3d", cnt); 3칸을 할당하고, 왼쪽 정렬!
				
				if(count % 5 ==0) { // 정수가 5개 출력되면, 다음 라인으로 넘긴다.
					System.out.println("");
				}
				count++;
			}
		}
	}
}
