package kr.ac.yeongnam.day13;

import java.util.HashMap;
import java.util.Map;

class Member{
	String name;
	String phone;
	
	Member(String name, String phone){
		this.name = name;
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}

	/*
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	*/
	
	
	/*
	@Override
	public int hashCode() {
		return this.name.hashCode() + this.phone.hashCode();
	}
	*/
	
	
	

}

class Car {
	private String name;
	private String id;
	
	public Car(String name, String id) {
		this.name = name;
		this.id = id;
	}
}





public class MapMain02 {

	public static void main(String[] args) {
		
		Map<Member, Car> list = new HashMap<>();
		list.put(new Member("홍길동", "010-1111-2222"), new Car("소나타", "34거1456"));
		list.put(new Member("윤길동", "010-3333-4444"), new Car("모닝", "63나8843"));		
		list.put(new Member("홍길동", "010-1111-2222"), new Car("K7", "53소3423"));
		
		System.out.println("등록된 차량대수 : " + list.size() + "개");
		System.out.println("등록된 차량대수 : " + list.size() + "개");
		
		// 왜 키값이 같은데 중복으로 보지 않을까?
		// 인스턴스 객체를 new 했으니, 주소가 다를 수밖에 없다. 그래서 다르다고 인식하는 것이다.
		
		
		Member m = new Member("홍길동", "010-1111-2222");
		Member m2 = new Member("홍길동", "010-1111-2222");
		
		System.out.println("m == m2 : " + (m == m2));
		// System.out.println(m.name.equals(m2.name) && m.phone.equals(m2.phone));
		// System.out.println("equals() : " + m.equals(m2)); // Object 클래스에는 객체비교하는 equals 메소드가있음.
		// String에 있는 equals는 Object의 equals를 오버라이딩함. object의 equals는 주소값을 비교함.
		// "hello".equals("hello");
		
		System.out.println("equals() : " + m.equals(m2)); // Object 클래스에는 객체비교하는 equals 메소드가있음.
		
		String str = "Hello world";
		String str2 = new String("Hello world");
		
		System.out.println(str == str2);
		System.out.println(str.equals(str2));
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());	
		
	}

}

