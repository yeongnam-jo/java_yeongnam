package kr.ac.yeongnam.day04;

public class ArrayMain01 {

	public static void main(String[] args) {

		
		/*
		 * 스택에 있는 변수는 자동 초기화가 되지 않는다. 
		 * 따라서 찍어보면 에러난다.
		int[] arr;
		System.out.println("arr: " + arr);
		*/
		
		int[] arr = new int[5];
		System.out.println("arr: " + arr); 
		/*
		 	arr의 시작 주소값이 나타난다. @표시가 나타나는 것은 주소값임.
		 	그러나, 실제 주소값은 아니다. JVM이 가상의 주소값을 매핑해둔 것이다. 
		 	그것을 해쉬값이라고 한다.
		 	@15db9742 => 16진수 해쉬코드값이다.
		 */
		
		System.out.println("1번째 정수 : " + arr[0]); // Heap 영역에는 초기값이 있다. 에러 안남.
		System.out.println("2번째 정수 : " + arr[1]); // Heap 영역에는 초기값이 있다. 에러 안남.
		System.out.println("3번째 정수 : " + arr[2]); // Heap 영역에는 초기값이 있다. 에러 안남.
		System.out.println("4번째 정수 : " + arr[3]); // Heap 영역에는 초기값이 있다. 에러 안남.
		System.out.println("5번째 정수 : " + arr[4]); // Heap 영역에는 초기값이 있다. 에러 안남.
		//System.out.println("6번째 정수 : " + arr[5]); // 인덱스 넘은 값을 넣으면, 예외 발생
		
		// 5개의 변수에 10, 20, 30, 40, 50 대입
		
		/*
		 * 직접 대입
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		*/
		
		/*
		for(int i = 0; i <= 4; i++) {
			arr[i] = (i+1) * 10;
		}
		
		*/
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i+1) * 10;
					
		}
		
		System.out.println();
		System.out.println("<대입 후 ...>");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i+1 + "번째 정수 : " + arr[i]);			
		}
		
		
		/*
		System.out.println();
		System.out.println("<대입 후 ...>");
		System.out.println("1번째 정수 : " + arr[0]); 
		System.out.println("2번째 정수 : " + arr[1]); 
		System.out.println("3번째 정수 : " + arr[2]); 
		System.out.println("4번째 정수 : " + arr[3]); 
		System.out.println("5번째 정수 : " + arr[4]);
		*/ 
	}

}
