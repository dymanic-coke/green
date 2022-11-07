package sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkFare(); 체크페어의 경우 버스타입 메소드 이기때문에 작동 안함 강제 타입변환 필요
		
		Bus bus = (Bus)vehicle;
		
		bus.run();
		bus.checkFare();
	}

}
