package kr.ac.yeongnam.day09.abs02;

public class SamsungPrinter extends Printer{

	private String name = "삼성프린터";
	
	public void samPrint() {
		System.out.println("삼성 프린터에서 출력중...");
	}
	
	public void print() {
		System.out.println("삼성도 오버라이딩 했습니다...출력중...");
	}
}
