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

public class Problem03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] intArr = new int[5]; 
		for(int i = 0; i < 5; i ++) {
			System.out.print((i+1) + "번째 정수 : ");
			intArr[i] = sc.nextInt();									
			
			if( i >= 1) {
				while(intArr[i-1] >= intArr[i]) {
					// 0 ~ i-1 까지의 element에 있는 요소들을 콤마로 나열해야 함.
					System.out.printf("%4d", intArr[0]);
					
					for(int j = 1; j < i; j++) {
						System.out.print(", " + intArr[j]);						
					}

					System.out.println("보다 큰수가 와야합니다.");					
					System.out.print((i+1) + "번째 정수 : ");
					intArr[i] = sc.nextInt();								
				}				
			}			
		}
		
		System.out.println();
		System.out.println("< PRINT >");
		for(int num : intArr) {
			System.out.print(num + " ");
		}
		
		//REVERS
		int [] reverseArr = new int [intArr.length];		
		for(int i = (intArr.length - 1); i >= 0; i--){
			int tmp = intArr[i];
			int reverseInt = 0;
			int count = 0;
			
			if(tmp % 10 == 0) {
				tmp /= 10;
			}
			
			// System.out.println("tmp ==> " + tmp); // debug
			
			while((tmp % 10) != 0) {
				reverseInt = reverseInt * 10;
				reverseInt = reverseInt + (tmp % 10);
				tmp /= 10;
				count++;
			}			
			reverseArr[4-i] = reverseInt;
			
			// System.out.println(); // debug
			// System.out.println("reverseArr[4-" + i + "]" + reverseInt); // debug
		}
		
		System.out.println();
		System.out.println("< REVERSE >");
		for(int num : reverseArr) {
			System.out.print(num + " ");
		}		
	}
}
