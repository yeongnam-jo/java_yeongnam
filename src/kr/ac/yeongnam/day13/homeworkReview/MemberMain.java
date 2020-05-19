package kr.ac.yeongnam.day13.homeworkReview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Member> memberList = new ArrayList<>();
		
		memberList.add(new Member("aaa", "1111"));
		memberList.add(new Member("bbb", "2222"));
		memberList.add(new Member("ccc", "3333"));
		memberList.add(new Member("ddd", "4444"));

		try {
			System.out.println("패스워드 변경서비스입니다...");
			System.out.print("아이디를 입력하세요 : ");
			String id = sc.nextLine();

			Member user = new Member(id);

			boolean bool = memberList.contains(user);
			if (!bool) {
//				System.out.println("입력하신 아이디 [ " + id + "]는 존재하지 않습니다");
//				System.out.println("서비스를 종료합니다");
//				System.exit(0);
//				throw new CheckIDPASSException("입력하신 아이디 [ " + id + "]는 존재하지 않습니다");
				throw new CheckIDPASSException(1); // throw: 사용자 정의 예외처리, 기존에 있는 거 사용하려면 throws 해야함. 그리고, new 생성자만 하면 안날라가네. 신기하네
			}

			int index = memberList.indexOf(user);

			System.out.print("현재 패스워드를 입력하세요 : ");
			String password = sc.nextLine();
			if (!memberList.get(index).getPassword().equals(password)) {
//				System.out.println("패스워드가 올바르지 않습니다");
//				System.out.println("서비스를 종료합니다");
//				System.exit(0);
//				throw new CheckIDPASSException("패스워드가 올바르지 않습니다");
				throw new CheckIDPASSException(2);
			}

			System.out.print("변경할 패스워드를 입력하세요 : ");
			String newPassword = sc.nextLine();
//		memberList.remove(index);
//		memberList.add(index, new Member(id, newPassword));
			memberList.set(index, new Member(id, newPassword));

			System.out.println("< 전체 회원 목록 >");
			Iterator<Member> ite = memberList.iterator();
			while (ite.hasNext()) {
				System.out.println(ite.next()); // 객체이름만 쓰면, toString 메소드를 호출한다
			}
		} catch (CheckIDPASSException e) {
			System.out.println(e.getMessage());
			System.out.println("서비스를 종료합니다");
		}
	}
}








