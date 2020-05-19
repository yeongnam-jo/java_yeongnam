package kr.ac.yeongnam.day14;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// iotest/Koala.jpg  --> iotest/Koala3.jpg 복사

/*
 	작업순서
 	1. Stream open
 	2. 작업 수행(read, write)
 	3. Stream close 
 */
public class FileIOMain03 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		
		try {
			// 1단계 : stream open
			fis = new FileInputStream("iotest/Koala.jpg");
			fos = new FileOutputStream("iotest/Koala2.jpg");
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			long start = System.currentTimeMillis();
			
			// 2단계 : 작업 수행(Read, Write)
			while(true) {
				int c = bis.read();
				if(c == -1) break;
				bos.write(c);				
			}
			
			System.out.println("복사가 완료됐습니다.");
			long end = System.currentTimeMillis();
			
			System.out.println("소요시간 : " + (end -start) / 1000.);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			if(bis != null) {
				try {
					bis.close();
				} catch (Exception e) {
					e.printStackTrace();
					
				}
			}
			
			if(bos != null) {
				try {
					bos.close();
				} catch (Exception e) {
					e.printStackTrace();
					
				}
			}
			
			
			try {
				fis.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			try {				
				fos.close();
				
			} catch (Exception e3) {
				e3.printStackTrace();
			}
		}
	}
}


