package ch09.ex9_4;

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		
		names.add("김");
		names.add("이");
		names.add("박");
		names.add("최");
		
		names.set(0, "한");
		names.remove(1);
		
		for(int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
	}

}
