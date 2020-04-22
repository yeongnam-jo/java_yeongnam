package kr.ac.yeongnam.day08;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee(1, "홍길동", "사원", 3_500);
		Employee e2 = new Employee(1, "윤길동", "사원", 3_700);
		Employee e3 = new Employee(1, "강길동", "대리", 4_400);
		Employee e4 = new Employee(1, "김길동", "대리", 4_500);
		Employee e5 = new Employee(1, "박길동", "과장", 5_000);
		e.info();
		e2.info();
		e3.info();
		e4.info();
		e5.info();
		
		Employee[] empList = {e, e2, e4};
		Manager m = new Manager(100, "나캡틴", "부장", 8_000, empList);
		System.out.println();
		m.info();
		
		System.out.println();
		Manager02 m2 = new Manager02(100, "나캡틴", "부장", 8_000, empList);
		m2.info();

		
		

	}

}
