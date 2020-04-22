package kr.ac.yeongnam.day08;

public class Manager02 extends Employee {
	
	Employee[] empList;
	
	public Manager02() {

	}
	
	public Manager02(int no, String name, String grade, int salary, Employee[] empList) {
		
		super(no, name, grade, salary);
		this.empList = empList;
		
	}
	
	public void info() {
		// this.info();
		super.info();
	
		
		System.out.println("===================================================");
		System.out.println("\t\t< 관리 사원 목록 >");		
		System.out.println("===================================================");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("===================================================");
	}
	
	/*
	public void info() {
		System.out.println("사원번호 : " + getNo() + " 사원명 : " + this.getName() + " 직급 : " + grade 
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
