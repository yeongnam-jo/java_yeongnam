package kr.ac.yeongnam.day01;

public class LottoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LottoUtil
		LottoUtil2.printToday();
		System.out.println("오늘의 로또 확률" + LottoUtil.todayProbability());
		System.out.println("내일의 로또 확률" + LottoUtil2.tomorrowProbability());

	}

}
