package kr.ac.yeongnam.day14.homeworkTest;

import java.io.File;

public class Test {
	public static void main(String[] args) {
		File fileObj = new File("iotest"); // 현재 디렉토리 내 (파일명.확장자)						
		boolean file = fileObj.isFile();
		String type = (file ? "파일" : "DIR");			
		
		double length = fileObj.length();
		long modifiedInfo = fileObj.lastModified();					
		// fileList.add(new Files(element, type, length, modifiedInfo));
		
		System.out.println(type +  " "+ length + " "+ modifiedInfo);
	}

}
