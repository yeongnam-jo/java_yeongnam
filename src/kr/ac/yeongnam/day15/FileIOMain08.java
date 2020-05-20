package kr.ac.yeongnam.day15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import kr.ac.yeongnam.util.FileClose;

public class FileIOMain08 {

	public static void write() {
		UserInfo user = new UserInfo("홍길동", 25, "경기도 광명시");
		System.out.println(user);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter("iotest/userInfo.txt");
			bw = new BufferedWriter(fw);
			
			/*
			bw.write(user.getName());
			bw.write(user.getAge());
			bw.write(user.getAddr());
			*/
			
			bw.write(user.getName() + ":" + user.getAge() + ":" + user.getAddr());
			bw.newLine();
			bw.flush();
		
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(bw, fw);
		}
		
	}
	
	public static void read() {
		UserInfo user = null;		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr= new FileReader("iotest/userInfo.txt");
			br = new BufferedReader(fr);
			
			String data = br.readLine();
			// System.out.println(data);
			String[] dataArr = data.split(":");
			// System.out.println(Arrays.toString(dataArr));
			
			String name = dataArr[0];
			String addr = dataArr[2];
			int age = Integer.parseInt(dataArr[1]);
			user = new UserInfo(name, age, addr);
			
			System.out.println("userInfo.txt 로드완료");
			System.out.println(user);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(br, fr);
		}
		
		/*
		UserInfo user = null;
		System.out.println(user);
		*/
	}
	
	public static void main(String[] args) {
		
		// write();
		read();
	}
}
