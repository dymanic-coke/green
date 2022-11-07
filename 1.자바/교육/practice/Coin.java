package practice;

import java.util.Random;

public class Coin {

	public static void main(String[] args) {
		Random random = new Random();
		int a = (random.nextInt(500)+1) * 10;
		System.out.println(a);
		
	}

}
