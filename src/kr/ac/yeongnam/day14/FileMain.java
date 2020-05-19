package kr.ac.yeongnam.day14;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMain {

	public static void main(String[] args) {
		
		/*
		File fileObj = new File("iotest\\aaa.txt");
//		File fileObj = new File("C:\\Lecture\\java-workspace\\java\\iotest\\aaa.txt");
		
		String name = fileObj.getName();
		
		System.out.println("파일명 : " + name);
		System.out.println("parent : " + fileObj.getParent());
		System.out.println("path : " + fileObj.getPath());
		System.out.println("절대경로 : " + fileObj.getAbsolutePath());
		
		boolean bool = fileObj.isFile();
		System.out.println("isFile() : " + (bool ? "파일입니다" : "디렉토리입니다"));
		
		bool = fileObj.isDirectory();
		System.out.println("isDirectory() : " + (bool ? "디렉토리입니다" : "파일입니다"));
		
		bool = fileObj.exists();
		System.out.println(name + (bool ? " : 존재합니다" : " : 존재하지 않습니다"));
		
		long length = fileObj.length();
		System.out.println("파일 크기 : " + length + "byte(s)");
		
		long lastTime = fileObj.lastModified();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("마지막 수정시간 : " + sdf.format(new Date(lastTime)));
		*/
			
		
		File dirObj = new File("iotest");
		boolean bool = dirObj.exists();
		System.out.println(bool ? "유효한 디렉토리 입니다." : "유효하지 않은 디렉토리입니다.");
		
		String[] list = dirObj.list();
		System.out.println("------------------------");
		System.out.println("\t" + dirObj.getName() + " 디릭토리정보");
		System.out.println("------------------------");
		for(String element : list) {
			System.out.println(element);
		}
		System.out.println("------------------------");
		
		
		File newDirObj = new File("iotest/하마");		
		System.out.println(newDirObj.mkdir() ? "dir 생성" : "dir 생성 실패");
		
		newDirObj = new File("iotest/새폴더/오리");		
		System.out.println(newDirObj.mkdir() ? "dir 생성" : "dir 생성 실패");
		System.out.println(newDirObj.mkdirs() ? "dir 생성" : "dir 생성 실패");
		
		newDirObj = new File("iotest/새폴더");
		bool = newDirObj.delete();
		System.out.println(bool ? "삭제성공" : "삭제실패");
		// child 폴더만 삭제된다.
		// 그리고, 그 하부에 데이터가 있으면 삭제 불가능.
		
		
		/*
		 * 아직 안만들었는데 경로까지 나온다.
		File happy = new File("iotest/구구구");
		String name = happy.getName();
		System.out.println("파일명 : " + name);
		System.out.println("parent : " + happy.getParent());
		System.out.println("path : " + happy.getPath());
		System.out.println("절대경로 : " + happy.getAbsolutePath());
		*/

		
	}
}












