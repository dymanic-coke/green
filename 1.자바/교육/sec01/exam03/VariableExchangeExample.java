package sec01.exam03;

public class VariableExchangeExample {

	public static void main(String[] args) {
		
		int x = 3;
		int y = 5;
		System.out.println("x는 " + x + ", y는 " + y);
		
		int dump = x;
		x = y;
		y = dump;
		System.out.println("x는 " + x + ", y는 " + y);

	}

}
