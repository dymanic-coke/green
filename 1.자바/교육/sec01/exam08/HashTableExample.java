package sec01.exam08;

import java.util.*;

public class HashTableExample {

	public static void main(String[] args) {
		
		Map<String, String> map = new Hashtable<>();
		
		map.put("Spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력하세요");
			System.out.print("아이디: ");
			String id = scan.nextLine();
			System.out.print("비밀번호: ");
			String passward = scan.nextLine();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(passward)) {
					System.out.println("접속했습니다.");
					break;
				} else {
					System.out.println("비밀번호가 틀립니다.");
				} 
			}else {
					System.out.println("아이디가 틀립니다.");
				}
			}
		}
	}

