package kr.ac.yeongnam.day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * Set : 순서(X), 중복 허용(X)
 * 	==> 데이터를 빠르게 탐색하기 위해 만들어진 구조.
 *  - HashSet
 *  - TreeSet
 * 
 */

public class SetMain {
	public static void main(String[] args) {
		
		// Set<String> set = new HashSet<>();
		Set<String> set = new TreeSet<>();
		
		System.out.println("입력 전 set의 데이터 총 개수 : " + set.size());
		
		System.out.println("\"one\" 데이터 삽입 성공 여부 " + set.add("one"));
		System.out.println("\"one\" 데이터 삽입 성공 여부 " + set.add("one"));
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		set.add("one");
		
		System.out.println("입력 후 set의 데이터 총 개수 : " + set.size());
		
		/*
		 * Set 전체 데이터를 출력 방식
		 * 1. 1.5 버전의 for문(foreach, 향상된 for문)
		 * 2. Iterator 객체를 이용
		 * 3. toArray() 메소드 이용
		 */
				
		System.out.println("< 1.5버전의 for문을 이용한 전체 출력 >");
		for(String str : set) {
			System.out.println(str);
		}
		System.out.println("얼레? 순서가 막 지멋대로 들어갔네?");
		
		
		/*
		 * Iterator 주요메소드
		 * 	hasNext() : 접근할 다음 데이터의 존재 여부 판단(boolean) 
		 * 	next() 	  : 다음 데이터 이동
		 */
		System.out.println("< Iterator 객체를 이용한 출력 > ");
		Iterator<String> ite = set.iterator();
		
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		
		System.out.println("< toArray() 메소드를 이용한 출력 > ");
		Object[] objArr = set.toArray();
		for(int i = 0; i< objArr.length; i++) {
			String str = (String)objArr[i];
			System.out.println(objArr[i] + ", 길이 : " + str.length());
		}
	}

}
