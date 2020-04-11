package kr.ac.yeongnam.day03;



public class LoopMain02 {

	public static void main(String[] args) {
		
		/*
		 	*****
		 	_****
		 	__***
		 	___**
		 	____*
	 	
        */	
		
		for(int i =1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				
				if(j <i) {
					System.out.print('-');
				} else {
					System.out.print('*');
				}
			}
			System.out.println("\n");
		}
		
		
		
		
		
		/*
		 	*****
		 	_****
		 	__***
		 	___**
		 	____*
		 
		방법1
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print("_");
			}
			for(int k=1; k <= 6-i; k++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
		
		*/
		
		/*
		 	12345
		 	12345
		 	12345
		 	12345
		 	12345
		 */
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.printf("%d", j);
			}
			System.out.println("\n");
		}
		
		
		
		
		/*
		 	*
		 	**
		 	***
		 	****
		 	*****
		
		for(int i=1; i <= 5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");				
			}
			System.out.println("\n");
		}
		*/
		
		
		/*
		 *****
		 *****
		 *****
		 
		for(int i=1; i <=3; i++) {
			for (int j=1; j<=5; j++) {
				System.out.print("*");	
			}
			System.out.println("\n");
		}
		*/
		
		
		
		
		/*
		
		int cnt =1;
		for(;cnt <= 5;cnt++) {
			System.out.println("*");
		}
		
		System.out.println("cnt: " + cnt);
		//System.out.println("cnt: " + cnt);
		
		// for문 안에서 변수를 선언했다면, breaks를 넘어가면 변수가 삭제된다. => 메모리 효율성
		for(int cnt2 = 1;cnt2 <= 5;cnt2++) {
			System.out.println("*");
		}
		int cnt2 = 1; // 원래는 변수를 2번 선언하면 에러난다.
		System.out.println("cnt2" + cnt2);
		
		*/
		
		
		
	}

}
