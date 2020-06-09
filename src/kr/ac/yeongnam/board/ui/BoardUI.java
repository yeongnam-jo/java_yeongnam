package kr.ac.yeongnam.board.ui;

public class BoardUI extends BaseUI{

	private int choiceMenu() {
		System.out.println("---------------------------------");
		System.out.println("\t\t게시판 관리 프로그램");
		System.out.println("---------------------------------");
		System.out.println("\t1. 전체 게시물 조회");
		System.out.println("\t2. 번호로 게시물 조회");
		System.out.println("\t3. 게시물 등록");
		System.out.println("\t4. 게시물 수정");
		System.out.println("\t5. 게시물 삭제");
		System.out.println("\t0. 종료");
		System.out.println("---------------------------------");
		int type = scanInt("\t번호를 선택하세요: ");
		
		return type;
		
	}
	
	@Override
	public void execute() throws Exception {

		int type = choiceMenu();
		
		switch(type) {
		case 1 :
			System.out.println("전체 게시믈 조회서비스");
			break;
		case 2 :
			"당 게시물 조회 서비"
		case 3 :
		case 4 :
		case 5 : 
		case 0 :
		}
		
		
	}
	
	

}
