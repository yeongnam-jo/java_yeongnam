package kr.ac.yeongnam.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileClose {

	
	public static void close(FileReader fr) {
		if (fr != null) {
			
			try {
				fr.close();				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
						
	}
	
	public static void close(FileWriter fw) {
		if(fw != null) {
			try {
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}
	}
		
}
