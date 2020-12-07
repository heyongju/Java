package example;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("autumn", "1234");
		map.put("winter", "12345"); //아이디와 비밀번호를 미리 저장
		
		Scanner scanner = new Scanner(System.in); //키보드로부터 입력된 내용을 받기 위해 생성
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.print("아이디: ");
			String id = scanner.nextLine(); //키보드로 입력한 이이디를 읽음
			System.out.print("비밀번호: ");
			String password = scanner.nextLine(); //키보드로 입력한 빌민번호를 읽음
					
			if(map.containsKey(id)) {
				if(map.containsValue(password)) {
					System.out.println("로그인 되었습니다.");
					break;
				}else {
					System.out.println("비밀번호를 확인해주세요.");
				}
			}else {
				System.out.println("존재하지 않는 아이디 입니다.");
			}
			System.out.println();
		}
	}

}
