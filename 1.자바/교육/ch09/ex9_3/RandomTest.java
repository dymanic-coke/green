package ch09.ex9_3;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int a = 10;
		
		System.out.println("임의 정수 :" + random.nextInt());
		System.out.println("0이상 " + a + "미만의 임의 정수: " + random.nextInt(a));
		System.out.println("임의의 실수: " + random.nextDouble());
		
		boolean gamble = random.nextBoolean();
		if(gamble) {
			System.out.println("홀");
		} else {
			System.out.println("짝");
		}
		
	}

}
