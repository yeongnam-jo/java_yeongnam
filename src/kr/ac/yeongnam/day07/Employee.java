package kr.ac.yeongnam.day07;

public class Employee {

	
	private String name; 			   // 사원명
	private int    salary; 			   // 연봉
	private static int	   totalEmployeeCount; // 총 사원수
	
	
	// 접근제한자 public => 모든 곳에서 활용 가능한 메소드.	
	// 메소드는 보통 public으로 선언한다.
	// 접근제한자를 안적으면, default(같은 패키지 내에서만 접근 가능)
	
	public Employee() {		
		// this.totalEmployeeCount++;
		Employee.totalEmployeeCount++;
	}
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
		// this.totalEmployeeCount++;
		Employee.totalEmployeeCount++;
	}
	
	public void info() {
		System.out.println("사원명 : " + name + "연봉 : " + salary);
		System.out.println("입사한 총 사원 수 : " + Employee.totalEmployeeCount + "명");
	}
	
	// totalEmployeeCount 변수가 private 이기 때문에, 
	// 이 변수를 실행클래스에서 활용하려면 따로 메소드 정의가 필요함.
	// 근데, 이렇게 생성하면 반드시 객체를 생성해야 한다.
	// static 변수는, 객체 생성 이전에 만들어지니까 객체가 없어도 호출이 가능해야 한다.
	// 어떤 방법이 있을까?
	// public void totalEmployeeInfo() ---> public static void totalEmployeeinfo()
	public static void totalEmployeeInfo() {
		// this.name = "윤길동"; ==> static이 생성됐을 때, 객체가 생성된것을 보장할 수 없으므로 에러가 난다.
		// static 메소드 내에서는, static 메소드와 static 변수만 사용 가능하다.
		System.out.println("입사한 총 사원 수 : " + Employee.totalEmployeeCount + "명");
	}
	
}
