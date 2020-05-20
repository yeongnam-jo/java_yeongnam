package kr.ac.yeongnam.day15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

import kr.ac.yeongnam.util.FileClose;

/*
 	콘솔에서 명령어를 입력하여 원본파일을 대상파일에 저장하는 프로그램
 	$ java  FileIOMain07   aaa.txt   bbb.txt
 */

public class FileIOMain07 {

	public static void main(String[] args) {
		
		System.out.println("args length : " + args.length);
		for(String arg : args) {
			System.out.println(arg);
		}
		
		if(args.length <2) {
			System.out.println("명령구문이 잘못됐습니다.");
			System.out.println("java FileIOMain07 원본파일명 대상파일명");
			System.exit(0);
		}
		
		System.out.println(Arrays.toString(args));
		File oriFile = new File(args[0]);
		
		if(!oriFile.exists()) {
			System.out.println("[" + args[0] + "] 파일이 존재하지 않습니다.");
			System.out.println("[" + args[0] + "] 파일이 존재하지 않습니다.");
			System.exit(0);
		}
		
		// File reader... File writer...
		FileReader fr = null;
		FileWriter fw = null;
		
		// BufferedReader ... Buffered Writer...
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {

			
			// 원본 파일로부터 읽어와서 RAM에 둔다.
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			
			
			// RAM에 둔 내용을 대상 파일로 쓴다.
			fw = new FileWriter(args[1]);
			bw = new BufferedWriter(fw);
			
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				bw.write(data);
				bw.newLine();
			}
			
			bw.flush();
			System.out.printf("[%s] -> [%s] 복사완료\n", args[0], args[1]);
			
		} catch(FileNotFoundException fnfe){
			System.out.println("[" + args[0] + "] 파일이 존재하지 않습니다.");
			
		}
		catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(br, fr);
			FileClose.close(bw, fw);
		}
		
		
		
		
	}
}
