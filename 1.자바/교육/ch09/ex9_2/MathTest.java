package ch09.ex9_2;

public class MathTest {

	public static void main(String[] args) {
		

		
		
		System.out.printf("수학의 파이(원주율) 값: %.10f\n", Math.PI);
		int dice = (int)(Math.random()*6)+1;
		System.out.printf("임의 난수 값: %.10f\n", Math.random());
		System.out.printf("주사위 숫자: %d\n", dice);
		System.out.printf("9.81의 내림값: %f\n", Math.floor(9.31));
		System.out.printf("31의 제곱근: %.10f\n", Math.sqrt(31));
		System.out.printf("2의 11승: %f\n", Math.pow(2, 11));
	}

}
