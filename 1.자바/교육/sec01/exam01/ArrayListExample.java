package sec01.exam01;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("서울시");
		list.add("대전시");
		list.add("대구시");
		list.add(2, "부산시"); // 대구시가 3인덱스로 밀려나면서 2인덱스에 부산시 저장
		list.add("광주시");
		
		int size = list.size(); //size 메소드는 Array의 length 인덱스와 비슷
		System.out.println("총 객체수: " + size);
		System.out.println();
		
		String skill = list.get(3);
		System.out.println("3: " + skill);
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
		
		list.remove(2); //"부산시"삭제 및 데이터 이동
		list.remove(2); //"대구시"삭제 및 데이터 이동
		list.remove("광주시");
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
	}

}
