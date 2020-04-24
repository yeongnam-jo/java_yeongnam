package kr.ac.yeongnam.day10;

public class CastMain {

	/*
	 * 
	
	static void print(Child01 c) {
		c.print();
	}
	
	static void print(Child03 c) {
		c.print();
	}
	
	static void print(Child02 c) {
		c.print();
	}
	
	*/
	
	static Parent getInstance() {
		//return new Child01();
		//return new Child02();
		return new Child03();
		
	}
	
	static void print(Parent p) {
		
		/*
		if(p instanceof Child01) {
			Child01 c = (Child01) p;
			c.study();
			c.sleep();
			
		} else if(p instanceof Child02) {
			Child02 c = (Child02) p;
			c.play();
			c.sing();
		} else if(p instanceof Parent) {
			System.out.println("hello");
		}
		*/
		
		
		p.print();
		System.out.println("p instanceof Child01 : " + (p instanceof Child01));
		System.out.println("p instanceof Child02 : " + (p instanceof Child02));
		System.out.println("p instanceof Parent : " + (p instanceof Parent));

	}
	
	public static void main(String[] args) {

		// Parent p = getInstance();
		// print(p);		
		
		Child01 c01 = new Child01();
		print(c01);
		
//		Child02 c02 = new Child02();
//		print(c02);
//		
//		Parent p = new Parent();
//		print(p);
		
//		Child03 c03 = new Child03();
//		print(c03);
		
		
		/*
		Parent p = new Child01(); // 묵시적 형변환
		p.print(); // 원래는 부모의 메소드를 호출해야 하나, 오버라이드 했기 때문에 자식의 메소드를 호출
		// p.sleep(); => 에러난다.
		
		System.out.println();
		Parent p2 = new Child02();
		p2.print();
			
		System.out.println();
		Parent p3 = new Parent();
		p3.print();
		*/

		
		/*
		Child02 c02 = new Child02();
		c02.print();
		c02.play();
		c02.sing();		
		
		System.out.println("=====");
		Child01 c01 = new Child01();
		c01.print();
		c01.sleep();
		c01.study();
		
		System.out.println("=====");
		Parent p = new Parent();
		p.print();
		*/
		
		
		
	}

}
