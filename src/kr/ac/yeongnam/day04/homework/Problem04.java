package kr.ac.yeongnam.day04.homework;

import java.util.Scanner;

/*
 3. 다음의 결과를 보이는 코드를 작성하시오    
 	1번째 정수 : 10    
 	2번째 정수 : 5       
 	  10보다 큰수가 와야합니다    
 	2번째 정수 : 12    
 	3번째 정수 : 36 
 	4번째 정수 : 6      
 	  10, 12, 36보다 큰수가 와야합니다       
 	4번째 정수 : 22      
 	  10, 12, 36보다 큰수가 와야합니다       
 	4번째 정수 : 40      
 	5번째 정수 : 67        
 	
 	< PRINT >    
 	10  12  36  40  67        
 	
 	< REVERSE >    
 	76  4  63  21  1
 */

public class Problem04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int[] nums = new int[30];
		System.out.print("1 - 100 사이의 정수를 입력하시오 : ");		
		int intNum = sc.nextInt();		
		
		int count = 0;		
		for(int i = 1; i <= intNum; i++) { // intNum의 약수를 구하고, nums 배열에 할당
			if(intNum % i == 0) {
				nums[count] = i;
				count++;
			}
		}
		
		System.out.println(intNum + "의 약수의 개수 : " + count + "개");
		
		// 배열의 길이는 반드시 선언되어야 깊은 복사가 가능하다.
		int[] factorArr = new int[count]; // 약수의 개수 만큼 배열을 생성한다.
		System.arraycopy(nums, 0, factorArr, 0, count); // 깊은 복사 API
		
		System.out.println("< " + intNum + "의 " + count + "개 약수 출력 >");
		for(int num : factorArr) {
			System.out.print(num + " ");
		}		
	}
}
