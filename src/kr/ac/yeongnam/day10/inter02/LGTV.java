package kr.ac.yeongnam.day10.inter02;

public class LGTV implements TV {

	private boolean power;
	private int channelNo;
	private int volumeSize;
	
	public LGTV() {
		System.out.println("LG tV를 구매했습니다.");
		power = false;
		channelNo = 3;
		volumeSize = 10;
	}
	
	@Override
	public void togglePower() {
		// TODO Auto-generated method stub
		power = !power;
		if(power) {
			System.out.println("전원을 켰슴둥");
			info();
		} else {
			System.out.println("전원을 끕니다.");
		}
	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		channelNo++;
		info();
	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		channelNo--;
		info();
		
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		if(volumeSize != MAX_VOLUME) {
			volumeSize++;			
		}
		info();
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		if(volumeSize != 0) {
			volumeSize--;			
		}
		info();
		
	}

	@Override
	public void mute() {
		// TODO Auto-generated method stub
		volumeSize = 0;
		info();
		
	}
	
	public void info() {
		System.out.println("현재 채널번호 : " + channelNo + "음량크기 : " + volumeSize);
	}

	
}
