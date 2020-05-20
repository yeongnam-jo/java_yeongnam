package kr.ac.yeongnam.day15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileMain10 {
	private static List<UserVO> list;
	
	public static void write() {
		list = new ArrayList<>();
		list.add(new UserVO("홍길동", 25, "010-1111-2222", "서울시 서초구"));
		list.add(new UserVO("윤길동", 30, "010-1111-2222", "경기도 성남시 분당구"));
		list.add(new UserVO("강길동", 29, "010-1111-2222", "경기도 광명시"));
		list.add(new UserVO("최길동", 42, "010-1111-2222", "서울시 동작구"));
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;		
		
		try {
			 fos = new FileOutputStream("iotest/user_list.txt"); // 바이트 단위
			 oos = new ObjectOutputStream(fos); // 객체 크키만큼 한번에 저장
			 
			 /*
			 for(int i = 0; i < list.size(); i++) {
				 oos.writeObject(list.get(i));				 
			 }
			 */
			 
			 oos.writeObject(list);
			 
			 System.out.println("저장 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}

	
	public static void read() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("iotest/user_list.txt");
			ois = new ObjectInputStream(fis);
					
			/*
			for(int i = 0; i < list.size(); i++) {
				UserVO user = (UserVO) ois.readObject();
				System.out.println(user);				
			}	
			*/
			
			list = (List<UserVO>) ois.readObject();
			for(UserVO list : list) {
				System.out.println(list);
			}
						
			System.out.println("로드 완료...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	
	public static void main(String[] args) {
		write();
		read();
	}
}
