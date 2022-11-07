package sec01.exam06;

public class CarExample {

	public static void main(String[] args) {
		
		SportCar sportCar = new SportCar();
		
		for(int i=1; i<=10; i++) {
			sportCar.speedUp();
			if(sportCar.speed< 90) {
			System.out.println("차량 속도: " + sportCar.speed+ "km/h");
		} else {
			sportCar.stop();
			return;
		}
		
		
	}

}
}