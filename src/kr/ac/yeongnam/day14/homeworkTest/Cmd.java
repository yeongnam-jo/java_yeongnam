package kr.ac.yeongnam.day14.homeworkTest;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Cmd {

	private String nowDir = "iotest";
	private Scanner sc;
	private String option;
	
	public void execute() {
		showUpper();
		showList();
		option = showOption();
	
		while(!option.equals("q") || !option.equals("Q")) {
			
			if(option.equals("c") || option.equals("C")) {			
				
			} else if(option.equals("r") || option.equals("R")){
				
			} else if(option.equals("d") || option.equals("D")){
				
			} else if(option.equals(".")) {
				
			} else if(option.equals("m") || option.equals("M")) {
				
			} else {
				System.out.println("잘못 입력하셨습니다.");			
			}
		}
		
		/*
		File dirObj = new File("iotest"); // 현재 디렉토리 정보		
		String[] list = dirObj.list(); // 현재 디렉토리 내 파일리스트

		// File fileObj;		
		List<Files> fileList = new ArrayList<>();
		
		*/
		
		/*
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]);			
			File fileObj = new File(this.nowDir + list[i]);
			double length = fileObj.length();
			
			System.out.println(length);
			
			// fileList.add()
		}
		*/
		
		
	
		/*
		for(String element : list) { // 현재 디렉토리 내 파일리스트를 for 돌림
						
			// System.out.println(element);
			File fileObj = new File(this.nowDir + element); // 현재 디렉토리 내 (파일명.확장자)						
			boolean file = fileObj.isFile();
			String type = (file ? "파일" : "DIR");
			
			//System.out.println(type);			
			double length = fileObj.length();			
			//System.out.println(length);			
			long modifiedInfo = fileObj.lastModified();				
			//System.out.println(modifiedInfo);
			fileList.add(new Files(element, type, length, modifiedInfo));						
			// System.out.println(element);
		}
		*/
		
		/*
		
		for(int i = 0; i < fileList.size(); i++) {
			System.out.println(fileList.get(i).getName());			
			System.out.println(fileList.get(i).getModifiedInfo());
			
			System.out.println(fileList.get(i).getType());			
			System.out.println(fileList.get(i).getSize());			
		}
		*/
		
		
		/*
		Iterator<Files> ite = fileList.iterator();
		while(ite.hasNext()) {
			Files tmp = ite.next();
			String nameTmp = tmp.getName();
			String typeTmp = tmp.getType();
			double sizeTmp = tmp.getSize();
			String modifiedInfoTmp = tmp.getModifiedInfo();				
			System.out.printf("%s\t%s\t%f\t%s\t\n", nameTmp, typeTmp, sizeTmp, modifiedInfoTmp);
		}		
		*/
		
	}
	
	
	public void showUpper() {
		
		File dirObj = new File(getNowDir());
		// String[] list = dirObj.list();
		
		System.out.println("=======================================");
		System.out.println("\t\t" + dirObj.getName() +"\t");
		System.out.println("=======================================");
		System.out.println("이름\t종류\t크기\t마지막수정날짜");
		System.out.println("=======================================");
		
		
		/*
		for(String element : list) {
			System.out.println(element);
		}
		*/
	}
	
	public void showList() {
		
		File dirObj = new File(getNowDir()); // 현재 디렉토리 정보		
		String[] list = dirObj.list(); // 현재 디렉토리 내 파일리스트

		// File fileObj;		
		List<Files> fileList = new ArrayList<>();
		
		
		for(String element : list) { // 현재 디렉토리 내 파일리스트를 for 돌림
			
			// System.out.println(element);
			File fileObj = new File(getNowDir() + "/" + element); // 현재 디렉토리 내 (파일명.확장자)						
			boolean file = fileObj.isFile();
			String type = (file ? "파일" : "DIR");
			
			//System.out.println(type);			
			long length = fileObj.length();			
			//System.out.println(length);			
			long modifiedInfo = fileObj.lastModified();				
			//System.out.println(modifiedInfo);
			fileList.add(new Files(element, type, length, modifiedInfo));						
			// System.out.println(element);
		}
		
		
		Iterator<Files> ite = fileList.iterator();
		while(ite.hasNext()) {
			Files tmp = ite.next();
			String nameTmp = tmp.getName();
			String typeTmp = tmp.getType();
			long sizeTmp = tmp.getSize();
			String modifiedInfoTmp = tmp.getModifiedInfo();				
			System.out.printf("%s\t%s\t%d byte(s)\t%s\t\n", nameTmp, typeTmp, sizeTmp, modifiedInfoTmp);
		}					
		
	}
	
	public String showOption() {
		sc = new Scanner(System.in);
		System.out.println();
		System.out.println("[C]폴더 생성  [R]이름수정  [D]삭제  [.]상위폴더이동  [m]하위폴더 이동  [Q]종료");
		System.out.print("선택 : ");
		String option = sc.nextLine();
		
		return option;
	}
	
	
	public String setDir(String newDir) {
		this.nowDir = this.nowDir + "/" + newDir;
		
		return nowDir;		
	}
	
	
	
	public String getNowDir() {
		return nowDir;
	}

	
}
