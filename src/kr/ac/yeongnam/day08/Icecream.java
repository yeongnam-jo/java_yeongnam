package kr.ac.yeongnam.day08;

public class Icecream {
	
	private String name;
	private int price;
	
	
	@Override
	public String toString() {
		
		return "아이스크림명 : " + name + ", 가격: " + price;
	}


	/**
	 * name, price의 값으로 초기화하는 생성자
	 * @param name 설정할 아이스크림명
	 * @param price 설정할 아이스크림 가격
	 */
	public Icecream(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	/**
	 * 아이스크림 정보를 출력
	 */
	public void info() {
		System.out.println("아이스크림명 : " + this.name + "가격 : " + this.price );
	}
	
	
	/**
	 * 아이스크림명을 알려주는 메소드
	 * @return 아이스크림명
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * 아이스크림 가격을 알려주는 메소드
	 * @return 아이스크림 가격
	 */
	public int getPrice() {
		return this.price;
	}
	
	/**
	 * 사용자가 넘겨준 이름으로 수정하는 메소드
	 * @param name 수정할 이름
	 */
	public void setName(String name) {
		this.name = name;		
	}
	
	/**
	 * 사용자가 넘겨준 가격으로 수정하는 메소드
	 * @param price 수정할 가격
	 */
	public void setPrice(int price) {
		this.price = price;
	}

}
