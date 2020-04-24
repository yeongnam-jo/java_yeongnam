package kr.ac.yeongnam.day10.inter02;

public class SamsungTV implements TV {

	private boolean power;
	
	public SamsungTV() {
		System.out.println("삼성 tv 구매");
	}
	
	@Override
	public void togglePower() {
		// TODO Auto-generated method stub
		power = !power;
		if(power) {
			System.out.println("전원을 켰슴둥");			
		} else {
			System.out.println("전원을 끕니다.");
		}

	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		System.out.println("채널을 올립니다.");

	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		System.out.println("채널을 올립니다.");

	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("볼륨을 올립니다.");

	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("볼륨을 내립니다.");

	}

	@Override
	public void mute() {
		// TODO Auto-generated method stub
		System.out.println("음소거");

	}

}
