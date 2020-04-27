package kr.ac.yeongnam.day11;

import java.util.Random;

class Super {
	public final int MAX = 100;
	
	public /*final*/ void print() {
		System.out.println("super print() 호출");
	}

}

class Sub extends Super{
	
	@Override
	public void print() {
		System.out.println("sub 호출");
	}
}

class MyRandom extends Random{
	
	/**
	 * nextInt(10)
	 * 상위클래스 Random의  0 ~ 9 사이의 난수 추출이 아닌 
	 * 1~ 10 사이의 난수를 추출
	 */
	@Override
	public int nextInt(int bound) {
		
		int r = super.nextInt(bound) + 1;
		
		return r;
	}

}

class FinalMain{
	public static void main(String[] args) {
		// Random r = new Random();
		// int random = r.nextInt(100) + 1;
		
		Random r = new MyRandom();
		int random = r.nextInt(2);
		
		System.out.println("추출된 정수 : " + random);
	}
}
