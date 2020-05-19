package kr.ac.yeongnam.day14;

import java.io.FileReader;
import java.io.FileWriter;

import kr.ac.yeongnam.util.FileClose;

public class FileIOMain05 {
	// iotest/FileIOMain03.java --> iotest/FileIOMain03.java.txt 복사
	
	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		
		try {
			fr = new FileReader("iotest/FileIOMain03.java");
			fw = new FileWriter("iotest/FileIOMain03.java.txt");
			
			while(true) {
				int c = fr.read();
				if(c == -1) break;
				// System.out.print((char) c);
				fw.write(c);
			}
			fw.flush(); // 습관적으로 그냥 씁시다! IO 출력 관련해서는...
			
			System.out.println("복사가 완료됐습니다.");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			FileClose.close(fr);
			FileClose.close(fw);
			
			/*
			if(fr != null) {
				try {
					fr.close();
					
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			
			if(fw != null) {
				try {
					fw.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			*/
			
		}
		
	}

}
