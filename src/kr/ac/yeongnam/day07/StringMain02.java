package kr.ac.yeongnam.day07;

public class StringMain02 {

	public static void main(String[] args) {

		String str = new String("Hello");
		String str2 = "Hello";
		
		System.out.println("str : [" + str + "]");
		System.out.println("str2 : [" + str2 + "]");
		
		System.out.println("==== '==' ====");
		
		if(str == str2) {
			System.out.println("str == str2");
		} else {
			System.out.println("str != str2");
		}
		
		System.out.println("====equals====");
		
		boolean bool =str.equals(str2);
		if(bool) {
			System.out.println("str == str2");
		} else {
			System.out.println("str != str2");
		}
		
		System.out.println("====equalsIngnoreCase====");
		boolean bool2 = str.equalsIgnoreCase(str2);
		if(bool2) {
			System.out.println("str == str2");
		} else {
			System.out.println("str != str2");
		}
		
		System.out.println("====startsWithd & endsWith====");
		String str3 = "hello world";
		System.out.println("str3 : [" + str3 + "]이 \"h\"로 시작하나요?" + str3.startsWith("h"));
		System.out.println("str3 : [" + str3 + "]이 \"He\"로 시작하나요?" + str3.startsWith("HE"));
		System.out.println("str3 : [" + str3 + "]이 \"he\"로 시작하나요?" + str3.startsWith("he"));
		System.out.println("str3 : [" + str3 + "]이 \"world\"로 끝나나요?" + str3.endsWith("worlds"));
		
		
		
		System.out.println("====compareTo====");
		str = "Hello";
		str2 = "HeLlo";
		
		int cmp = str.compareTo(str2);
		System.out.println("compareTo() 결과 : " + cmp);
		
		System.out.println("====compareTo(2)====");
		str = "banana";
		str2 = "boat";
		
		int cmp2 = str.compareTo(str2);
		if(cmp2 == 0) {
			System.out.println("같다");
		} else if(cmp2 < 0) {
			System.out.println(str + " < " + str2);
		} else {
			System.out.println(str + " > " + str2);			
		}
		
		
		String[] names = {"홍길동", "홍길순", "강길동", "윤길동", "한길동", "김철수", "강철홍", "홍길동"};
		System.out.println("< 이름이 \"홍길동\"인 사람 검색 >");
		for(String name : names) {
			if(names.equals("홍길동")) {
				System.out.println(name);
			}
		}
		System.out.println("< 성이 \"홍\"인 사람 검색 >");
		//startsWith
		for(String name : names) {
			if(name.startsWith("홍길동")) {
				System.out.println(name);
			}
		}
		
		System.out.println("< 이름이 \"길동\"인 사람 검색 >");
		//endsWithd
		
		System.out.println("< \"홍\"이 포함된 사람 검색 >");
		for(String name : names) {
			if(name.contains("홍")) {
				System.out.println(name);
			}
		}
	}

}
