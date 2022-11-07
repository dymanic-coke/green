package sec02.exam04;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.printf("result1=%6d\n", result1);
		
		int result2 = v1 - v2;
		System.out.printf("result2=%6d\n", result2);
		
		int result3 = v1 * v2;
		System.out.printf("result3=%6d\n", result3);
		
		int result4 = v1 / v2;
		System.out.printf("result4=%6d\n", result4);
		
		int result5 = v1 % v2;
		System.out.printf("result5=%6d\n", result5);
		
		double result6 = (double) v1 / v2;
		System.out.printf("result6=%6.1f\n", result6);
	}

}
