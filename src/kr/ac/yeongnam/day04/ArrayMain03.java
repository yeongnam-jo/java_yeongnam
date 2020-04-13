package kr.ac.yeongnam.day04;

import java.util.Arrays;

public class ArrayMain03 {

	public static void main(String[] args) {

		int[] ar = {10, 20, 30, 40, 50};
		
		// ar = {500, 400, 300}; 이렇게는 안됩니다.
		ar = new int[] {500, 400, 300}; // 이렇게 new 키워드로, 새로운 heap 영역을 생성해야 합니다.
		System.out.println("ar : " + Arrays.toString(ar));
		
		System.out.println("=====================");
		
		int[] arr = {10, 20, 30, 40, 50};
		int[] copyArr = arr; // 얕은 복사
		
		copyArr = new int[arr.length]; //배열의 길이는 반드시 선언되어야 깊은 복사가 가능하다.
		
		System.arraycopy(arr, 2, copyArr, 0, 3); //깊은 복사 방법1
		
		/* 깊은복사 방법2
		for(int i = 2, j = 0; i < arr.length; i++, j++) {
			copyArr[j] = arr[i]
		}
		*/
		
		
		// System.arraycopy(arr, 0, copyArr, 0, arr.length); // 깊은 복사 방법1
		
		/* 깊은 복사 방법2
		  for(int i = ; i < arr.length; i++){
		  	copyArr[i] = arr[i];
		  }
		 */
		
		System.out.println("< arr의 모든 정수 출력 >");
		for(int item : arr) {
			System.out.println(item);
		}

		System.out.println("< copyArr의 모든 정수 출력 >");
		for(int item : copyArr) {
			System.out.println(item);
		}
		
		arr[2] = 100;
		
		System.out.println("< 변경 후 arr의 모든 정수 출력> ");
		for(int num : arr) {
			System.out.println(num);
		}
		
		System.out.println("< copyArr의 모든 정수 출력> ");
		for(int num : copyArr) {
			System.out.println(num);
		}
		
		
//				
//		String[] strArr = {"폴리텍", "자바", "교육"};
//		String[] copyArr = strArr;
//		
//		/*
//		String[] copyArr = strArr;
//		System.out.println(strArr);
//		System.out.println(copyArr);
//		*/
//		
//		System.out.println("< strArr의 문자열 출력 >");
//		for(String str : strArr) {
//			System.out.println(str);
//		}
//		
//		System.out.println("< copyArr의 문자열 출력 >");
//		for(String str : copyArr) {
//			System.out.println(str);
//		}
//		
//		strArr[1] = "hello world";
//		System.out.println("< strArr의 문자열 출력 >");
//		for(String str : strArr) {
//			System.out.println(str);
//		}
//		
//		System.out.println("< copyArr의 문자열 출력 >");
//		for(String str : copyArr) {
//			System.out.println(str);
//		}
		
	}

}
