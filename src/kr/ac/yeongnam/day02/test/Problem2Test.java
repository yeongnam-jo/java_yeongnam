package kr.ac.yeongnam.day02.test;

public class Problem2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		String aString = (String) (a + "입니다.");
		System.out.println(aString);
		
		int first = 1;
		int second = 2;
		int third = 3;
		
		if(first == 1 & second ==2 & third ==3) {
			System.out.println("hi");			
		}
			
		if(first == 1 & second ==2 & third !=3) {
			System.out.println("bye");			
		}

	}

}
