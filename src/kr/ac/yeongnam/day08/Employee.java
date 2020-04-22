package kr.ac.yeongnam.day08;

public class Employee {
	
	private int no; 		// 사원번호
	private String name; 	// 사원명
	private String grade;;  // 직급
	private int salary; 	// 연봉
	
	// 기본 생성자를 만들어야, 상속받은 클래스에서 기본생성자를 사용할 수 있다.
	public Employee() {
		
	}
	
	public Employee(int no, String name, String grade, int salary){
		this.no = no;
		this.name = name;
		this.grade = grade;
		this.salary = salary;
	}

	public void info() {
		System.out.println("사원번호 : " + no + " 사원명 : " + name + " 직급 : " + grade 
				+ " 연봉 : " + salary + "만원");
	}
	
	public int getNo() {
		return no;
	}
	
	public String getName() {
		return name;
	}
}
