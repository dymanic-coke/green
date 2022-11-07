package sec01.exam06;

import java.util.*;

public class hashMapExample {

	public static void main(String[] args) {
		
		Map<String,Integer> kMap = new HashMap<>();
		
		kMap.put("신용권", 85);
		kMap.put("홍길동", 90);
		kMap.put("동장군", 80);
		kMap.put("홍길동", 95);
		
		System.out.println("총 Entry 수: " + kMap.size());
		
		System.out.println("\t홍길동 : " + kMap.get("홍길동"));
		System.out.println();
		
		Set<String> keySet = kMap.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while ( keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = kMap.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		kMap.remove("홍길동");
		System.out.println("총 Entry 수: " + kMap.size());
		
		Set<Map.Entry<String, Integer>> entrySet = kMap.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		kMap.clear();
		System.out.println("총 Entry 수: " + kMap.size());
	}

}
