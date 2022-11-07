package sec04.exam04;

public class Calculator {
	
	
	//메소드 선언
	int plus(int a, int b) {
		int result = a + b;
		return result;
	}
	
	double avg(int a, int b) {
		double sum = plus(a, b);
		double result = sum / 2;
		return result;
	}
	void println(String message) {
		System.out.println(message);
	}
	
	void execute() { 
		double result = avg(7, 10);
		println("실행결과: " + result);
	}

}
