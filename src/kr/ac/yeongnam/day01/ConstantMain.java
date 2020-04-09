package kr.ac.yeongnam.day01;

public class ConstantMain {
	
	public static void main(String[] args) {
		
		final double PI = 3.14;
		int radius = 10;
		double area = radius * radius * PI;
		
		System.out.println("반지름: " + radius + "==> 원 넓이:" + area);
		
		// PI = 3.14555; final로 지정했기 때문에 에러가 난다.
		
		radius = 5;
		area = radius * radius * PI;
		System.out.println("반지름: " + radius + "==> 원 넓이:" + area);

		
		
		
	}

}
