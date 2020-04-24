package kr.ac.yeongnam.day10.inter02;

public class UserMain {

	public static void main(String[] args) {
		// LGTV tv = new LGTV();
		
		TV tv = new LGTV();
		tv = new SamsungTV();
		
		
		tv.togglePower();
		tv.channelDown();
		tv.channelUp();
		tv.volumeDown();
		tv.volumeUp();
		tv.mute();
		tv.channelDown();
		tv.channelUp();
		

	}
}
