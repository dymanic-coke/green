package sec01.exam04;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("서울시");
		set.add("대전시");
		set.add("부산시");
		set.add("대전시");
		set.add("대구시");
		
		int size = set.size();
		System.out.println("총 객체 수: " + size);
		
		Iterator <String> iter = set.iterator();
		while(iter.hasNext()) {
			String ele = iter.next();
			System.out.println("\t" + ele);
		}
		
		set.remove("서울시");
		set.remove("부산시");
		
		System.out.println("총 객체 수: " + set.size());
		
		iter = set.iterator();
		for(String ele : set) {
			System.out.println("\t" + ele);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어있음");
		}
	}

}
