package kr.ac.yeongnam.jdbc;

public class vvvv {

	public void cat() {
		System.out.println("cat");
	}
	
	public void cat(int a, int b) {
		System.out.println(a+b);
	}
	
	public int cat(int a, int b, int c) {
		return a+b;
	}
	
	public String cat(int a, int b, int c, int p) {
		return "d";
	}
	
	public static void main(String[] args) {
		
		vvvv v = new vvvv();
		v.cat();
		int a = v.cat(10, 20, 30);
		System.out.println(a);
		String d  = v.cat(1,2,3,4);
		System.out.println(d);
		
	}
}
