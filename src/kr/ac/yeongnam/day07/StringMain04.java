package kr.ac.yeongnam.day07;

public class StringMain04 {

	public static void main(String[] args) {

		String str = "";
		long start = System.currentTimeMillis();
		System.out.println(start);
		for(int i = 1; i < 100000; i++) {
			str = str + i;
		}

		long end = System.currentTimeMillis();
		System.out.println(end);
		
		System.out.println("start : " + start);
		System.out.println("end : " + end);
		System.out.println("소요시간 : " + (end - start) / 1000.0 + "초");
		
		
		StringBuffer sb = new StringBuffer();
		start = System.currentTimeMillis();
		for(int i = 1; i < 100000; i++) {
			// sb = sb + i;  ==> String이 아님.
			sb.append(i);
		}
		end = System.currentTimeMillis();
		System.out.println("소요시간 : " + (end - start) / 1000.0 + "초");

		
	}

}
