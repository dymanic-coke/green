package sec04.exam01;

public class Calculator {
	
	//메소드
	void powerOn() { //반환값없음
		System.out.println("전원을 켭니다.");
	}
	
	double plus(double x, double y) {
		double result = x + y;
		return result;
	}
	
	double divide(double x, double y) {
		double result = x / y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
