package kr.ac.yeongnam.day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 	MAP: key, value 쌍으로 이루어진 집합(순서 X, Key 중복 X)
 	 - HashMap
 	 - TreeMap
 	
 	활용: ID 등.
 */
public class MapMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		// key : id, value : password
		Map<String, String> map = new HashMap<>();
		
		map.put("aaa", "1111");
		map.put("bbb", "2222");
		map.put("ccc", "3333");
		map.put("ddd", "4444");
		
		System.out.println("패스워드 변경 서비스입니다.");
		System.out.println("변경할 아이디를 입력하세요 : ");
		String id = sc.nextLine();
		
		// 있으면 true
		if(!map.containsKey(id)) {
			System.out.println("입력하신 아이디 [" + id + "]는 존재하지 않습니다.");
			System.out.println("서비스를 종료합니다.");
			System.exit(0); // 프로그램 종료			
		} 
		
		System.out.print("현재 패스워드를 입력하세요 : ");
		String password = sc.nextLine();
		
		if(!map.get(id).equals(password)) {
			System.out.println("패스워드가 올바르지 않습니다.");			
			System.out.println("서비스를 종료합니다.");
			System.exit(0); // 프로그램 종료			
		}
		
		System.out.print("변경할 패스워드를 입력하세요 : ");
		String newPassword = sc.nextLine();
		map.put(id, newPassword);
		System.out.println("패스워드를 변경했습니다.");
		
		
		System.out.println("<전체 회원 목록>");
		// map은 toArray가 안된다.
		// Set으로 바꿔서, toArray 또는 iterator 활용.		
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println("id : " + id + ", password : " + map.get(key));			
		}
		
		System.out.println("++++++++++++++++++++");
		Set<Entry<String, String>> entry = map.entrySet();
		/*
		 * Map에 값을 전체 출력하기 위해서는 entrySet(), keySet() 메소드를 사용하면 되는데 
		 * entrySet() 메서드는 key와 value의 값이 모두 필요한 경우 사용하고, 
		 * keySet() 메서드는 key의 값만 필요한 경우 사용합니다.
		 * 
		 * Iterator 인터페이스를 사용할 수 없는 컬렉션인 Map에서 Iterator 인터페이스를 사용하기 위해서는 
		 * Map에 entrySet(), keySet() 메소드를 사용하여 Set 객체를 반환받은 후 
		 * Iterator 인터페이스를 사용하시면 됩니다.
		 */
		Iterator<Entry<String, String>> ite = entry.iterator(); 
		while(ite.hasNext()) {
			Entry<String, String> e = ite.next();
			String key = e.getKey();
			String value = e.getValue();
			System.out.println("key : " + key + "value : " + value);
		}
		
		System.out.println("++++++++++++++++++++");
				
		/*
		Set<Entry<String, String>> entry = map.entrySet();
		for(Entry e : entry) {
			System.out.println("id :" + e.getKey() + ", password : " + e.getValue());
			
		}
		*/
				
	}

}
