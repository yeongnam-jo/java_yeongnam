package kr.ac.yeongnam.day13.lotto01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LottoView {

	private Scanner sc;
	
	// 변수 초기화를 위해 생성자를 만든다.
	public LottoView() {
		sc = new Scanner(System.in);	
		
	}
	
	public void start() {

		System.out.print("게임 수를 입력 : ");

		int gameCount = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= gameCount; i++) {
			System.out.println("게임 " + i + " : " + getLottoNums());
		}
		
	}
	
	// 꼭 private으로 만들 필요는 없다.
	// 그러나, 다른 클래스에서는 어떻게 만들어지는지 알 필요도 없고 알아서도 안되기 때문에 private로 만든다.
	
	private String getLottoNums() {
		final int LOTTO_MAX = 6;
		Random r = new Random();
		
		List<Integer> nums = new ArrayList<>();
		List<Integer> lottoNums = new ArrayList<>();
		for(int i = 1; i <= 45; i++) {
			nums.add(i);
		}
		
		Collections.shuffle(nums);
		
		for(int i = 0; i < LOTTO_MAX; i++) {
			lottoNums.add(nums.get(i));
		}
		
		// System.out.println(Arrays.toString(lottoNums.toArray()));
		// Collections.shuffle(lottoNums);
		// System.out.println(Arrays.toString(lottoNums.toArray()));
		
		
		
		/*
		 * 방법4
		Set<Integer> lottoNums = new TreeSet<>();
		while(lottoNums.size() < LOTTO_MAX) {
			lottoNums.add(r.nextInt(45) + 1);
			System.out.print("!");
		}
			
		return Arrays.toString(lottoNums.toArray());		
		*/
		
		/*
		 * 방법3
		List<Integer> lottoNums = new ArrayList<>();
		while(lottoNums.size() < LOTTO_MAX) {
			int num = r.nextInt(45) + 1;
			if(!lottoNums.contains(num)) {
				lottoNums.add(num);
			}			 						
		}
		
		return Arrays.toString(lottoNums.toArray());
		*/
		
		/*
		 * 방법2
		int[] nums = new int[45];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = i+1;
		}
		
		for(int i = 0; i < lottoNums.length; i++) {
			int idx = r.nextInt(45-i); // 0 ~ 44
			int lottoNum = nums[idx]; // 0 ~ 44
			lottoNums[i] = lottoNum;
			
			int temp = nums[idx];
			nums[idx] = nums[nums.length-1-i];
			nums[nums.length-1-i] = temp;
			
			System.out.println("idx : " + idx + " : " + Arrays.toString(nums));
			//sc.nextLine();
		}
		*/
		
		
		
		/*
		 * 방법 1
		for(int i = 0; i < lottoNums.length; i++) {
			lottoNums[i] = r.nextInt(45) + 1;
			for(int j = 0; j < i; j++) {
				if(lottoNums[i] == lottoNums[j]) {
					i--;
					// System.out.print("!"); 중복체크 용도
					break;
				}
			}
		}
		*/
		
		
		// Arrays.sort(lottoNums); Array 정렬하는 메소드		
		return Arrays.toString(lottoNums.toArray());
		
	}
}
