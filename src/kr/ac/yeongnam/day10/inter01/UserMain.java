package kr.ac.yeongnam.day10.inter01;

public class UserMain {

	public static void main(String[] args) {
		LGTV lg = new LGTV();
		
		lg.powerOn();
		lg.channelUp();
		lg.channelDown();
		lg.volumeDown();
		lg.volumeUp();
		lg.powerOff();
		
		System.out.println("==================");
		SamsungTV sam = new SamsungTV();
		sam.togglePower();
		sam.soundDown();
		sam.soundUp();
		sam.channelDown();
		sam.channelUp();
		sam.togglePower();

	}
}
