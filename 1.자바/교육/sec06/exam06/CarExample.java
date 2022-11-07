package sec06.exam06;

public class CarExample {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		//속도를 잘못 넣었을 경우
		car.setSpeed(-50);
		
		System.out.println("현재 속도: " + car.getSpeed());
		
		//올바른 속도를 넣었을 경우
		car.setSpeed(60);
		
		//멈춤
		if(!car.isStop()) {
			car.setStop(true);
		}
		
		System.out.println("현재 속도: " + car.getSpeed());
		
		
	}

}
