package kr.ac.yeongnam.day02;

import java.util.Scanner;

public class OperationMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//짝수 홀수 판단
		System.out.println("정수를 입력: ");
		int num = sc.nextInt();
		sc.nextLine();
				
		//음수는 홀수짝수에 해당하지 않는다고 한다면...	
		boolean result = (num >= 0) && (num % 2 ==0);
		System.out.println(num + "짝수 판단여부" + result);
		
		
		
		// b가 a의 약수 여부(0은 나눠지지 않도록, 분기문 쓰지않고도 가능함)
		System.out.println("약수 여부를 알아봅시다. 정수를 2개 입력하삼.");
		int var1 = sc.nextInt();
		int var2 = sc.nextInt();
		sc.nextLine();
		boolean result2 = var2!=0 && var1%var2 ==0;
		System.out.println("약수여부" + result);
		
		
		int a=1, b=-1, c=0;
		
		//교환법칙이 성립하지 않는다!
		
		boolean bool = (++a > 0) && (++b > 0);
		//boolean bool = (++b > 0) && (++a > 0);
		
		System.out.printf("a = %d  b = %d  c = %d  bool = %b\n ", a, b, c, bool);
		
		

	}

}
