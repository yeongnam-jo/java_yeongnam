package kr.ac.yeongnam.day14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import kr.ac.yeongnam.util.FileClose;

public class FileIOMain06 {

	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		
			
		try {
			fr = new FileReader("iotest/FileIOMain03.java");
			fw = new FileWriter("iotest/FileIOMain03-1.java.txt");
			
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			
			while(true) {
				String str = br.readLine();
				if(str == null) break;
				bw.write(str);
				// bw.write('\n'); // os마다 엔터의 의미 다를 수 있음.
				bw.newLine();
			}
			
			bw.flush();
			
			/*
			while(true) {
				int c = br.read();
				if(c == -1) break;
				bw.write(c);
								
			}
			*/		
			
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			
			
			FileClose.close(fr);
			FileClose.close(fw);
		}
		
	}
	
}
