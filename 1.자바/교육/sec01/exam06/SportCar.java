package sec01.exam06;

public class SportCar extends Car {
	
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	//파이널 메소드는 오버라이딩 안됨
	
//	@Override
//	public void stop() {
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	}
}
