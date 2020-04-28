package kr.ac.yeongnam.day12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * List : 순서(o), 중복허용(o)
 * 	- ArrayList
 *  - LinkedList
 */

public class ListMain {
	
	public static void main(String[] args) {
		// List list = new ArrayList(); // 기존 방식(raw type)
		// List<String> list = new ArrayList<String>(); // 1.5 버전부터 가능
		List<String> list = new ArrayList<>(); // 1.7 버전부터 가능
		ArrayList<String> list2 = new ArrayList<>(); // 1.7 버전부터 가능

		// list = new LinkedList<>();
		
		/*
		 * 왜 List<String> 으로 선언하느냐? 
		 * 	- ArrrayList
		 *  - LinkedList 
		 *  - 둘 다를 유연하게 사용하려고 ㅎㅎ
		 */
		
		System.out.println(list.size());
		System.out.println(list2.size());
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("1");
						
		System.out.println(list.size());
		System.out.println("입력 후 list 원소의 총 개수 : " + list.size());
		
		
		/*
		 * List의 전체데이터 출력 방식
		 * 1. index를 이용
		 * 2. 1.5버전의 for문(foreach문, 향상된 for문) 
		 */
		System.out.println("< get(index)를 이용한 전체 출력 >");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		
		System.out.println("< 1.5버전의 for문을 이용한 전체 출력 >");
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println("2번지에 위치한 데이터 : " + list.get(2));
		System.out.println("삭제된 데이터 : " + list.remove(2)); // index 입력하면 String 반환
		System.out.println("2번지에 위치한 데이터 : " + list.get(2));
	
		System.out.println("1 데이터 삭제 : " + list.remove("1"));
		System.out.println("1 데이터 삭제 : " + list.remove("1"));
	
		
		System.out.println("1 데이터 존재여부 : " + list.contains("1"));
		System.out.println("2 데이터 존재여부 : " + list.contains("2"));
		
		
		List<String> sub = new LinkedList<String>();
		sub.add("1");
		sub.add("2");
		sub.add("3");
		
		// list의 2번지에 "zero" 문자열 삽입
		list.add(2, "zero"); // add 메소드 오버로딩돼있음. 활용하자.
		
		
		System.out.println("< list 전체 데이터 출력 > ");
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println("< sub 전체 데이터 출력 >");
		for(String str : sub) {
			System.out.println(str);
		}
		
		System.out.println("====list.addAll(sub);===");
		list.addAll(sub);
		System.out.println("< list 전체 데이터 출력 > ");
		for(String str : list) {
			System.out.println(str);
		}
		
	
		System.out.println("====list.isEmpty()====");
		if(list.isEmpty()) {
			System.out.println("list가 비어있습니다.");
		} else {
			System.out.println("list 안비어있습니다.");
		}
		
		System.out.println("===list.clear()===");
		list.clear();
		System.out.println("====list.isEmpty()====");
		if(list.isEmpty()) {
			System.out.println("list가 비어있습니다.");
		} else {
			System.out.println("list 안비어있습니다.");
		}
		
		
		
		
		
	}

}
