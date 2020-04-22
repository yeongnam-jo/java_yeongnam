package kr.ac.yeongnam.day08;

public class IcecreamMain {

	public static void main(String[] args) {

		
		Icecream ice = new Icecream("비비빅", 1000);
		ice.info();
		
		System.out.println("아이스크림 가격 : " + ice.getPrice());
		System.out.println("아이스크림명 : " + ice.getName());

		ice.setPrice(500);
		System.out.println("아이스크림 가격 : " + ice.getPrice());
		
		
	}
	

}
