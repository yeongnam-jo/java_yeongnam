package kr.ac.yeongnam.day17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

import kr.ac.yeongnam.util.FileClose;


class AAA implements AutoCloseable{

	@Override
	public void close() throws Exception {
		
		System.out.println();
	}
	
	
}

public class URLConnectionMain {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		
		
//		try(
//				FileOutputStream fos = new FileOutputStream("iotest/naver.html");
//				OutputStreamWriter osw = new OutputStreamWriter(fos);
//				BufferedWriter bw = new BufferedWriter(osw);
//				AAA a = new AAA();
//				
//				){
//			
//		} catch(Exception e){
//			e.printStackTrace();
//		}
		
		

		
		// URLConnection은 추상클래스다. 즉, 객체를 만들 수 없다. 따라서 URL 객체를 통해서만 접근(사용) 가능하다.
		try {
			
			fos = new FileOutputStream("iotest/naver.html"); // 바이트 스트림으로 들어온다.
			osw = new OutputStreamWriter(fos, "utf-8");
			bw = new BufferedWriter(osw);
			
			
			
			// 필터 클래스
			
			URL urlObj = new URL("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=subway");
//			URL urlObj = new URL("http://172.16.88.129/Lecture/java-workspace/java/src/kr/ac/kopo/day17/InetAddressMain.java");
			URLConnection uc = urlObj.openConnection();
//			System.out.println(uc.getContentType());
//			System.out.println(uc.getContentLength());
//			System.out.println(uc.getContentEncoding());
			
			
			// URL 객체의 전송정보를 iotest/naver.html 저장
			InputStream is = uc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");// naver는 utf-8방식 / 바이트 단위로 온다.
			BufferedReader br = new BufferedReader(isr);// 속도 빠르게 받기 위해 BufferedReader 객체 사용
			
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				System.out.println(data);
				
				bw.write(data); //이렇게 하면 엔터 전까지만 읽는다.
				bw.newLine(); // 이렇게 해줘야 다음 문장도 읽지요
			}
			
			System.out.println("naver.html 저장하였습니다.");
			
			FileClose.close(br);
			FileClose.close(isr);
			FileClose.close(is);
			
			
			FileClose.close(bw);
			FileClose.close(osw);
			FileClose.close(fos);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		

		
	}

}
