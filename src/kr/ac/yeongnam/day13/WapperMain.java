package kr.ac.yeongnam.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WapperMain {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(new Integer(2));
		list.add(50);
		
		
		System.out.println(Arrays.toString(list.toArray()));
		
		int i = 10;
		Integer i2 = new Integer(100);
		Integer i3 = 123; // new 안해도 할당 가능함. 1.5버전 부터 가능. => auto boxing이라고 부름.
		int i4 = new Integer(200); // auto unboxing
	
		
		System.out.println(i + i2);
		System.out.println(i3);
		
		
		
				
	}
	
	
}

/*

public Member{
	private String id;
	private String password;
}

public Main {
	public static void main() {
		List<Member> list = new ArrayList<>();
	}
}
*/