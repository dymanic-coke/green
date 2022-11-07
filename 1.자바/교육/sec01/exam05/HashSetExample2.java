package sec01.exam05;

import java.util.*;

public class HashSetExample2 {

	public static void main(String[] args) {
		
		Set<Mem> set = new HashSet<>();
		
		set.add(new Mem("홍길동", 30));
		set.add(new Mem("홍길동", 30));
		
		System.out.println("총 객체 수: " + set.size());
	}

}
