package kr.ac.yeongnam.day02.homework;

import java.util.Scanner;

/*
2. 3661초가 몇 시간 몇 분 몇 초인지 환산해서 출력하시오.  
      결과출력 : 1시간 1분 1초 
 
      초를 입력하세요 : 3600 
   3600초 : 1시간 0분 0초  -> 1시간 
 
      초를 입력하세요 : 3610
   3610초 : 1시간 0분 10초 -> 1시간 10초  
 */

public class Problem2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 값을 입력받기 위해 Scanner 객체 생성
		
		System.out.print("초를 입력하세요 : ");
		int inputSeconds = sc.nextInt(); // 정수형태의 입력값을 받기 위해 변수 생성
		sc.nextLine(); // 버퍼 버그 방지를 위한 코드
		
		// 시, 분, 초 각각 계산
		int hours = inputSeconds / 3600; 
		int minutes = (inputSeconds % 3600) / 60;
		int seconds = (inputSeconds % 60) / 1;	
		
		if(hours == 0) {
			if(minutes == 0) { // 0시간 0분
				if(seconds ==0) { // 0시간 0분 0초
					System.out.println("0초보다 큰 시간을 써주세요.");
				} else { // 0시간 0분 x초
					System.out.println(inputSeconds + "초 : " + seconds + "초");					
				}
				
			} else { // 0시간 x분 
				if(seconds == 0) { // 0시간 x분 0초
					System.out.println(inputSeconds + "초 : " + minutes + "분 ");					
				} else { // 0시간 x분 x초
					System.out.println(inputSeconds + "초 : " + minutes + "분 " + seconds + "초");				
				}				
			}
		} else if(minutes == 0) { // x시간 0분
			if(seconds == 0) { // x시간 0분 0초
				System.out.println(inputSeconds + "초 : " + hours + "시간 ");				
			}else { // x시간 0분 x초
				System.out.println(inputSeconds + "초 : " + hours + "시간 " + seconds + "초");				
			}
		} else { // x시간 x분
			if(seconds == 0) { // x시간 x분 0초
				System.out.println(inputSeconds + "초 : " + hours + "시간 " + minutes + "분 ");
			} else { // x시간 x분 x초
				System.out.println(inputSeconds + "초 : " + hours + "시간 " + minutes + "분 " + seconds + "초");
			}			
		}				
	}
}
