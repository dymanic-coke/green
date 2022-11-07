package sec02.exam01;

public class AcarExample {

	public static void main(String[] args) {
		
		Acar myCar = new Acar();
		
		myCar.run();
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();
	}

}
