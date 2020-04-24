package kr.ac.yeongnam.day10.inter02;

public interface TV {
	
	int MAX_VOLUME = 30;
	
	
	/**
	 * 전원 켜고 끕니다.
	 */
	void togglePower();
	
	void channelUp();
	
	void channelDown();
	
	void volumeUp();
	
	void volumeDown();
	
	/**
	 * 음소거입니다.
	 */
	void mute();
	

}
