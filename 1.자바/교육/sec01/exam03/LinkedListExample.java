package sec01.exam03;

import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0, i);
			
		}
		
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간: " + (endTime-startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0, i);
			
		}
		
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간: " + (endTime-startTime) + " ns");
		
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.remove(0);
			
		}
		
		endTime = System.nanoTime();
		System.out.println("ArrayList 인덱스 삭제 걸린시간: " + (endTime-startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.remove(0);
			
		}
		
		endTime = System.nanoTime();
		System.out.println("LinkedList 인덱스 삭제 걸린시간: " + (endTime-startTime) + " ns");
	}

}
