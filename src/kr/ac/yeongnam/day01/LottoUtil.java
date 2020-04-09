package kr.ac.yeongnam.day01;

import java.util.Random;

/**
 * 로또와 관련된 여러가지 기능을 가지고 있는 클래스
 * @author 조영남
 * @since 2020.04.08
 * @version jdk1.5
 */


public class LottoUtil {

	public static double todayProbability() {
		/**
		 * 오늘의 로또 확률을 알려주는 기능입니다.
		 * @return 오늘의 로또 확률(0 ~ 1)
		 */
		
		Random r = new Random();
		double ranNum = r.nextInt(101);
		
		double probability = ranNum / 100;
		
		return probability;
		
	}
	
	
}
