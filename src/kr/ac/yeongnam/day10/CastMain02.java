package kr.ac.yeongnam.day10;

import java.util.ArrayList;

public class CastMain02 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(10);
		list.add("hello");
		list.add(new Icecream());
		list.add(new Hotdog());
		
		String str = (String) list.get(1); // 묵시적 형변환이 된다.
		System.out.println("str : " + str + ", length : " + str.length());
		
		
		Parent p = new Child01();
		Child01 c = (Child01) p;
		// Child01 c = (Child01) new Parent();
		c.print();
	}

}

class Icecream{
	
}
class Hotdog{
	
}