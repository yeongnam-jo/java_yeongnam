package kr.ac.yeongnam.day11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import kr.ac.yeongnam.day08.Icecream;;


public class DateMain {
	public static void main(String[] args) {
		
		Icecream ice = new Icecream("aaa", 1000);
		System.out.println("ice : " + ice);
		
		// 오늘은 2020년 04월 27일입니다.
		Date d = new Date();
				
		System.out.println("d : " + d);
		System.out.println("==========================");
		
		int year = d.getYear() + 1900;
		int month = d.getMonth() + 1;		
		
		System.out.println("year : " + year);
		System.out.println("month : " + month);

		// Calender
		Calendar c = Calendar.getInstance();
		System.out.println("c: " + c);
		
		year = c.get(1);
		year = c.get(Calendar.YEAR);
		month = c.get(2) + 1;
		month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DAY_OF_MONTH);
		int day = c.get(Calendar.DAY_OF_WEEK); // 1(일) ~ 7(토)
		String[] dayArr = {"", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		
		System.out.println("year : " + year);
		System.out.println("month : " + month);
		System.out.println("date : " + date);
		// System.out.println("day : " + day);
		System.out.println("day : " + dayArr[day]);
		
		// 2023년 10월 9일이 무슨 요일인가요?
		System.out.println("==================");
		c.set(2023, 10-1, 9); // 0 => 1월
		day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("day : " + day);
		System.out.println("day : " + dayArr[day]);
		
		System.out.println("==================");
		d = c.getTime();		
		System.out.println("d : " + d);
		System.out.println("c : " + c);
		
		d = new Date();
		c.setTime(d);
		System.out.println("c : " + c);
		
		// 이번 달(4월)의 마지막 날 수?
		month = c.get(Calendar.MONTH) + 1;
		int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(month + "월의 마지막 날은 " + lastDay + "일입니다.");
		
		// simpleDateFormat
		System.out.println("====simpleDateFormat=====");
		String pattern = "오늘은 yyyy년 MM월 dd일(E)입니다."; //M: 월   m: 분
		String pattern2 = "yyyy-MM-dd hh:mm:ss(E)";
		
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		SimpleDateFormat sdf2 = new SimpleDateFormat(pattern2);
		System.out.println(sdf.format(new Date()));
		System.out.println(sdf2.format(new Date()));
		
		
	}
}
