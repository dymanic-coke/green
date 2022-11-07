package sec05.exam01;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.model = "벤틀리";
		Car youCar = new Car();
		youCar.model = "마히바흐";
		
		myCar.run();
		youCar.run();
	}

}
