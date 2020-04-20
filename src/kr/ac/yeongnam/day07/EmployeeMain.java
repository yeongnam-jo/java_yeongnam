package kr.ac.yeongnam.day07;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int totalEmployeeCnt = 0;
		Employee e = new Employee("홍길동", 3500);
		// totalEmployeeCnt++;
		Employee e2 = new Employee("강길동", 4200);
		// totalEmployeeCnt++;
		e.info();
		e2.info();
		
		// System.out.println("입사한 총 사원 수 : " + e2.totalEmployeeCount + "명");
		// 왜 1이 나오느냐? (생성자가 EmployeeCount++ 코드가 있는데도!)
		// 왜냐하면, nonStatic은 인스턴트 당 메모리가 별도로 할당되기 때문이다.
		// 따라서, 클래스에서 하나로 관리해야 하는 변수가 있다면, static(정적) 변수로 관리한다.
		// 위의 상황은, totalEmployeeCunt 변수를 nonStatic으로 선언했을 때.
		
		// System.out.println("입사한 총 사원 수 : " + Employee.totalEmployeeCount + "명");
		Employee.totalEmployeeInfo();

	}

}
