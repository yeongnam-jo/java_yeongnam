package kr.ac.yeongnam.day04.test;

public class Problem03Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tmp = 8890;
		if(tmp % 10 == 0) {
			tmp /= 10;
		}
		while(tmp % 10 != 0) {
			System.out.println(tmp);
			tmp /= 10;
		}

	}

}
