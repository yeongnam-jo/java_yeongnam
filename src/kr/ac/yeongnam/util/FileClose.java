package kr.ac.yeongnam.util;

/*
 	jar 파일로 묶어서 다른 프로젝트에 넣어서 활용해도 됨.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;


public class FileClose {

	public static void close(Writer w) {
		if(w != null) {
			try {
				w.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(Reader r) {
		if(r != null) {
			try {
				r.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(Reader br, Reader r) {
		close(br);
		close(r);
	}
	
	public static void close(Writer bw, Writer w) {
		close(bw);
		close(w);
	}
	
	public static void close(Reader r, Writer w) {
		close(r);
		close(w);
	}
		
}
