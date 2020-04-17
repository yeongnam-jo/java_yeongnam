package kr.ac.yeongnam.day06;

import java.util.Arrays;

public class ExamMethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExamMethod exam = new ExamMethod();
		
		int sum = exam.getSum(1, 10); // 두개의 정수의 합을 구하는 메소드
		int totalSum = exam.getTotalSum(1, 10);
		
		System.out.println(sum);
		
		int[] nums = exam.getNums();
		System.out.println("추출된 난수 : " + Arrays.toString(nums));
		
		System.out.print("배열의 크기를 입력 : ");
		int size = exam.getNum();
		
		// 1 ~ 100 사이의 난수를 size 만큼 추출
		nums = exam.getNums(size);
		System.out.println("추출된 난수 : " + Arrays.toString(nums));
		
		// 1 ~ max 사이의 난수를 size 만큼 추출
		System.out.print("1 - 100 사이 정수 입력 : ");
		int max = exam.getNum();
		nums = exam.getNums(max, size);
		
		System.out.println("추출된 난수 : " + Arrays.toString(nums));
		
		
		

	}

}
