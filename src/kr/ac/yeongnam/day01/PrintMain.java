package kr.ac.yeongnam.day01;

public class PrintMain {
	
	public static void main(String[] args) {
		
		System.out.println("바로되네!!신기하네이거");
		System.out.println(10 + 12);
		System.out.println(10 + "ABC");
		System.out.println('A' + "ABC");
		
		System.out.println("======ASCII COD============");
		System.out.println("==================");
		// ASCII CODE(소문자, 대문자, 숫자문자, 특수문자, 공백문자) 1byte(256 가지, 괄호안의 것들을 다 표현할 수 있음.)
		// 한글이나 한자같은 다른 것들을 표현하려면 1 byte로 택도 없었다. 그래서 2byte로 표현해야한다.
		// '가' ==> 불가능
		// "가" ==> 가능
		
		// 2byte(16 bit) 표현법을 UNI CODE(ASCII CODE + 한글, 한자...) 
		// 자바는 UNI CODE, C는 ASCII CODE
		// 'A' ==> 65 ==> '\u0041'
		// '가' ==> 가능
		// "가" ==> 가능
		// 자바에서 문자('')는 UNI CODE로 표현됨. 즉, 숫자로 나타나게 된다. 00000000 00000001 등으로.. (사실 16진수로 표현됨)
		
		
		// 
		// 'A' => 65, 'a' => 97
		System.out.println("====ASCII====");
		System.out.println('A' + 'B'); //결과는? 131
		System.out.println("A" + "B"); //결과는? AB		
		System.out.println('A' + 10); // 결과는? 75
		System.out.println("A" + 10); // 결과는? 75
		
		
		System.out.println('A');
		System.out.println('\u0041');
		System.out.printf("%c\n", 'A');
		
		System.out.println("===='A' + 'B' + \"ABC\"======");
		System.out.println('A' + 'B' + "ABC"); // ABABC가 나올까? => 아님. +연산은 순차적으로 진행함.
		
		

		System.out.println("======정렬============");

		
		/*
		   10    ABC
		   1234  DE
		   8     Hello		   
		     어떻게 할까?
		  
		 */
		System.out.printf("%d %s\n", 5, "ABIC");
		System.out.printf("%d %s\n", 1234, "ABIC");
		System.out.printf("%d %s\n", 80, "ABIC");
		
		System.out.println("==========8칸(tap)========");
		
		System.out.printf("%d\t%s\n", 5, "ABIC");
		System.out.printf("%d\t%s\n", 1234, "ABIC");
		System.out.printf("%d\t%s\n", 80, "ABIC");
		System.out.printf("%d\t%s\n", 12345678, "ABIC");
		
		System.out.println("========10칸 오른쪽정렬==========");
		System.out.printf("%10d\t%s\n", 5, "ABIC");
		System.out.printf("%10d\t%s\n", 1234, "ABIC");
		System.out.printf("%10d\t%s\n", 80, "ABIC");
		System.out.printf("%10d\t%s\n", 12345678, "ABIC");
		
		System.out.println("=========10칸 왼쪽정렬=========");
		System.out.printf("%-10d\t%s\n", 5, "ABIC");
		System.out.printf("%-10d\t%s\n", 1234, "ABIC");
		System.out.printf("%-10d\t%s\n", 80, "ABIC");
		System.out.printf("%-10d\t%s\n", 12345678, "ABIC");

		System.out.println("=========기타=========");
		System.out.printf("[%05d]\n", 123);
		System.out.printf("%.3f\n", 12.54225);
		
		System.out.println("=========기타2=========");	
		System.out.printf("%.1f\n", 12.47); //12.5
		System.out.printf("%.1f\n", 12.42); //12.4
		
		System.out.printf("%.1f\n", 12.47); //12.5 반올림이 된다.
		System.out.printf("%.1f\n", 12.42); //12.4 반올림이 된다.
		
		System.out.printf("%.1f\n", 12.47 - 0.05); //절사 하는 방법!
		System.out.printf("%.1f\n", 12.42 - 0.05); //절사 하는 방법!
		
		
		//'M'의 유니코드 값을 알려면?
		System.out.println("=========문자의 유니코드를 볼려면?=========");	

		char ch = 'M';
		System.out.println(ch);
		
		System.out.println("========명시적 형변환. char < int =========");	

		System.out.printf("%d\n", (int) ch);
		System.out.println((int)ch);
		
		
		System.out.println("=========묵시적 형변환 char < int=========");	

		int num = 255;
		System.out.printf("%c\n", (char) num);
		System.out.printf("%c\n", num);
		
		// \n 이라는 문자 자체를 출력하려면?  => \ 자체가 이스케이프 역할을 한다.
		System.out.println("[\n]");
		System.out.println("[\\n]");
		System.out.println("'\n'");

		// "[\n]" 이라는 문자 자체를 출력하려면?
		System.out.println("\"[\\n]\"");
		
		//기타
		char ch4 = '\'';
		System.out.println(ch4);
	
		


		
		
		
	}
	
}
