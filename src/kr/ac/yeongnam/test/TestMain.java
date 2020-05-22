package kr.ac.yeongnam.test;

public abstract class TestMain {

	public static void main(String[] args) {
		int i= 1;
		while(i< 100) {
			if(i== 10) 
				break;
			System.out.println(i+ "자바의세계로오세요! " );
			i++;
			}
	}
	
	public abstract void printAll();
	
}
