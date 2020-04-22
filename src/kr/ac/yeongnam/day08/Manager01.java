package kr.ac.yeongnam.day08;

public class Manager01 extends Employee{
	
	Employee[] empList;
	
	public Manager01() {
		// super(); => Employee 생성자 호출
		// EMployee 생성자와 매개변수가 달라서 에러난다.
	}
	
	public Manager01(int no, String name, String grade, int salary, Employee[] empList) {
		/* 부모클래스에서 private로 선언하면, 자식클래스에서 접근할 수 없다.
		 * 그럴 땐, super(no, name, grade, salay) 등으로 접근한다. 그러면 부모클래스의 변수에 접근가능.
		this.no = no; // super.no = no; 라는 의미다.
		this.name = name; // 그러나, Manager01 클래스에, 인스턴스 변수를 새롭게 생성한다면, this와 super 구분해야 함.
		this.grade = grade;
		this.salary = salary;
		this.empList = empList;
		*/
	}
	
	
	/*
	public void info() {
		System.out.println("사원번호 : " + no + " 사원명 : " + name + " 직급 : " + grade 
				+ " 연봉 : " + salary + "만원");
		
		System.out.println("===================================================");
		System.out.println("\t\t< 관리 사원 목록 >");		
		System.out.println("===================================================");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("===================================================");
	}
	*/

}
