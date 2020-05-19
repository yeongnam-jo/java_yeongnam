package kr.ac.yeongnam.day14;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIOMain04 {

	public static void write() {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream("iotest/data_writer.txt");
			dos = new DataOutputStream(fos);
			
			char c = 'A';			
			// fos.write(c);
			dos.writeChar(c); //character => 2바이트
			dos.writeInt(30); //int => 4바이트
			dos.writeDouble(30);
			
			System.out.println("저장완료");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(fos != null) {
				try {
					fos.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}
	
	
	public static void read() throws Exception{
		FileInputStream fis = new FileInputStream("iotest/data_writer.txt");	
		DataInputStream dis = new DataInputStream(fis);
		
		char c = dis.readChar();
		int num = dis.readInt();
		double num2 = dis.readDouble();
		
		
		System.out.println("읽어온 문자 : " + c);
		System.out.println("읽어온 문자 : " + num);
		System.out.println("읽어온 문자 : " + num2);
		dis.close();
		fis.close();
		
		
	}

	public static void main(String[] args) {
		// write();
		try {			
			read();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
