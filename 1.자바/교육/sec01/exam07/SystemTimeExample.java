package sec01.exam07;

public class SystemTimeExample {

	public static void main(String[] args) {
		
		long time1 = System.nanoTime();
		
		long sum = 0;
		for(long i = 1; i<=10000000; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();
		
		System.out.println("1~10000000까지의 합계 : " + sum);
		
		System.out.println("계산에 " + (time2-time1) + "나노초가 소요되었습니다.");
	}

}
