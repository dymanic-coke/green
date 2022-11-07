package sec04.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator myCal = new Calculator();
		myCal.powerOn();
		
		double result1 = myCal.plus(3, 2);
		System.out.println("result1 = " + result1);
		
		double x = 10.5;
		double y = 20;
		double result2 = myCal.divide(x, y);
		System.out.println("result2 = " + result2);
		
		myCal.powerOff();
	}

}
