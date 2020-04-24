package kr.ac.yeongnam.day10.inter01;

public class SamsungTV {
	private boolean power;
	
	public SamsungTV() {
		System.out.println("삼성 TV를 구매했습니다.");
		power = false;
	}
	
	public void togglePower() {
		power = !power;
		System.out.println(power ? "전원 ON" : "전원OFF");
	}

	public void soundUp() {
		System.out.println("읍량을 올립니다.");
	}
	
	public void soundDown() {
		System.out.println("음량을 내립니다.");		
	
	}
	
	public void channelUp() {
		System.out.println("채널을 올립니다.");
	}
	
	public void channelDown() {
		System.out.println("채널을 내립니다.");
	}
	
		
}
