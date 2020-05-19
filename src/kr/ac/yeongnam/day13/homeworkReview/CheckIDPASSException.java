package kr.ac.yeongnam.day13.homeworkReview;

public class CheckIDPASSException extends Exception {

	private static String [] errMsg = {"", "아이디가 올바르지 않습니다", "패스워스가 잘못되었습니다"};

	
	public CheckIDPASSException() {
	}

	public CheckIDPASSException(String message) {
		super(message); // 메세지를 출력해주는 기본 메소드
	}

	public CheckIDPASSException(int errorCode) {
		this(errMsg[errorCode]);
	}
	
	
}










