package kr.ac.yeongnam.day17;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlMain {


	public static void main(String[] args) {
		try {
			
			
			
			//URL urlObj = new URL("https://www.naver.com:80");
			URL urlObj = new URL("https://search.naver.com/search.naver?sm=top_hty&fbm=0&ie=utf8&query=subway");
			
			System.out.println("프로토콜 : " +urlObj.getProtocol());
			System.out.println("호스트 이름: " +urlObj.getHost());
			System.out.println("포트번호" + urlObj.getPort()); // 현재 접속한 port 번호
			System.out.println("경로" + urlObj.getPath());
			System.out.println("쿼리" + urlObj.getQuery());
			
			InputStream is = urlObj.openStream(); //지금 1바이트로 받고 있기 때문에, 한글이 깨진다. 
			/*
			while(true) {
				int c = is.read();
				if(c == -1) break;
				System.out.print((char) c); 
				
			}
			*/
	
			
			//InputStreamReader isr = new InputStreamReader(is);
			//InputStreamReader isr = new InputStreamReader(is, "euc-kr");
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			
			
			while(true) {
				int c = isr.read();
				if(c == -1) break;
				System.out.print((char) c); 
				
			}
			
			
			// URLConnection은 추상클래스다. URL 객체를 통해서만 접근 가능하다.
			
			
			
		} catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
