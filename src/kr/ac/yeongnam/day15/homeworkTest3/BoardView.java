package kr.ac.yeongnam.day15.homeworkTest3;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BoardView {

	private Scanner sc;
	String title;
	String writer;	
	private List<Board> list = new ArrayList<>();
	
	BoardView(){
		sc = new Scanner(System.in);
	}
	
	public void start() {
		try {
			int num = 1;
			
			while(num != 0) {
				num = select();
				switch(num) {
				case 1:
					System.out.println("뭐야뭐야");
					printAll();
					break;
				case 2:
					printNum();
					break;
				case 3:
					upload();
					break;
				case 4: 
					edit();
					break;
				case 5:
					remove();
					break;			
				case 0:
					System.out.println("종료합니다.");
				default :
					System.out.println("번호를 잘못 입력하셨습니다.");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	public int select() {
		printMenu();
		
		System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		return num;
	}
	
	public void printAll() {
		System.out.println("여긴 오류 아냐000");
		FileInputStream fis = null;
		System.out.println("여긴 오류 아냐-111");
		ObjectInputStream ois = null;
		System.out.println("여긴 오류 아냐-222");
		
		try {
			
			System.out.println("여긴 오류 아냐1111");
			fis = new FileInputStream("iotest/board.txt");
			System.out.println("여긴 오류 아냐222");
			ois = new ObjectInputStream(fis);
			System.out.println("여긴 오류 아냐333");
			list = (List<Board>) ois.readObject();
			System.out.println("여긴 오류 아냐444");
						
			System.out.println("< 전체 게시글 조회 >");
			System.out.printf("%s\t %-20s\t %s\t %s\n", "번호", "제목", "글쓴이", "등록일");
			
			if(list.size() == 0) { //list == null
				System.out.println("조회 할 글이 없습니다.");
			} else {
				
				for(Board board : list) {
					int nameTmp = board.getNum();
					String titleTmp = board.getTitle();
					String writerTmp = board.getWriter();
					String dateTmp = board.getDate();
					
					System.out.printf("%d\t %-20s %s\t %s\n", nameTmp, titleTmp, writerTmp, dateTmp);
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void printNum() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("iotest/board.txt");
			ois = new ObjectInputStream(fis);
			list = (List<Board>) ois.readObject();
						
			if(list.size() == 0) { // list == null ?
				System.out.println("조회 할 글이 없습니다.");
			} else {
				System.out.print("조회 할 글번호를 입력해주세요 : ");
				int numTmp = sc.nextInt();
				sc.nextLine();
				
				System.out.printf("%s\t %-20s\t %s\t %s\n", "번호", "제목", "글쓴이", "등록일");
				System.out.printf("%d\t %-20s %s\t %s\n", 
						list.get(numTmp-1).getNum(), list.get(numTmp-1).getTitle(), 
						list.get(numTmp-1).getWriter(), list.get(numTmp-1).getDate());
				
			}
			
			/*
			System.out.println("< 전체 게시글 조회 >");
			System.out.printf("%s\t %-20s\t %s\t %s\n", "번호", "제목", "글쓴이", "등록일");
			if(list.size() == 0) { //list == null
				System.out.println("조회 할 글이 없습니다.");
			} else {
				
				for(Board board : list) {
					int nameTmp = board.getNum();
					String titleTmp = board.getTitle();
					String writerTmp = board.getWriter();
					String dateTmp = board.getDate();
					
					System.out.printf("%d\t %-20s %s\t %s\n", nameTmp, titleTmp, writerTmp, dateTmp);
					
				}
			}
			*/
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void upload() {
		try {
			System.out.print("등록할 제목을 입력 : ");
			title = sc.nextLine();
			System.out.print("등록할 글쓴이를 입력 : ");
			writer = sc.nextLine();
			
			/*
			num++;
			if(num > 100) {
				System.out.println("등록할 수 있는 게시글을 초과했습니다. (100건 제한)");
			}
			*/
			
			if(list.size() > 100) {
				System.out.println("등록할 수 있는 게시글을 초과했습니다. (100건 제한)");
			}
			
			list.add(new Board(list.size()+1, title, writer));
			System.out.println("게시글이 등록되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void edit() {
		try {
			if(list.size() == 0) {
				System.out.println("조회 할 글이 없습니다.");
			} else {
				System.out.print("수정을 원하는 글 번호를 입력하세요 : ");
				int numTmp = sc.nextInt();
				sc.nextLine();
				
				System.out.print("등록할 제목을 입력 : ");
				title = sc.nextLine();
				System.out.print("등록할 글쓴이를 입력 : ");
				writer = sc.nextLine();
				
				list.set(numTmp-1, new Board(numTmp, title, writer));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void remove() {
		try {
			if(list.size() == 0) {
				System.out.println("삭제를 할 게시글이 없습니다.");
			} else {
				System.out.print("삭제를 원하는 글번호를 입력하세요: ");
				int numTmp = sc.nextInt();
				sc.nextLine();
				
				list.remove(numTmp-1);
				System.out.println(numTmp + "번 글이 삭제됐습니다.");		
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	public void printMenu() {
		System.out.println("============================");
		System.out.println("1. 전체 게시물 조회");
		System.out.println("2. 글번호 조회");
		System.out.println("3. 글등록");
		System.out.println("4. 글수정");
		System.out.println("5. 글삭제");
		System.out.println("0. 종료");
		System.out.println("============================");
	}

}
