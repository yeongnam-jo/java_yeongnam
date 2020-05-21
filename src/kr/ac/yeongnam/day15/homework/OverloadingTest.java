package kr.ac.yeongnam.day15.homework;

public class OverloadingTest {

	
	//이름이 cat인 메서드
	void cat(){
		System.out.println("매개변수 없음");
	}
	
	//매개변수 int형이 2개인 cat 메서드
	void cat(int a, int b){
		System.out.println("매개변수 :"+a+", "+b);
	}
	
	//매개변수 String형이 한 개인 cat 메서드
	void cat(String c){
		System.out.println("매개변수 : "+ c);
	}
	
}


 