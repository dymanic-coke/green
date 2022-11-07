package sec02.exam03;

public class ForSumFrom1To100Example1 {

	public static void main(String[] args) {
		
		int sum = 1;
		
		int i = 1;
		for(i=1; i<=100; i++) {
			sum *= i;
		}
		
		System.out.println("1~" + (i-1) + "곱: " + sum);
	}

}
