package kr.ac.yeongnam.day01;

import java.util.Random;

public class LottoUtil2 {
	
	public static double tomorrowProbability() {
		Random r = new Random();
		double randomNumber = r.nextInt(101);
		
		double probability = randomNumber / 100;
		
		return probability;
		
	}
	
	public static void printToday() {
		System.out.println("오늘은 좋은 운이 따를거예요!");
	}

}
