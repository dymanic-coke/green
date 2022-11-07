package practice;

public class Car implements Key, Handle, Break {
	
	int speed;
	
	public void keyTurnOn() {
		System.out.println("시동을 킵니다.");
	}
	
	public void keyTurnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void goForward(boolean go) {
		if(go == false) {
			System.out.println("전진을 합니다.");
		for(int i=0; i<Break.MAX_SPEED; i += 10) {
			speed += i;
			System.out.println("현재 속도 : " + speed + "km/h");
		}
	}
	}
	public void goBackward(boolean back) {
		if(back == false) {
		System.out.println("후진을 합니다.");
		for(int i=0; i<-20; i-= 10) {
			speed -= i;
			System.out.println("현재 속도 : + +(speed) + km/h");
		}
		
	}
	}
	
	public void stop() {
		System.out.println("멈춥니다.");
		speed = 0;
		System.out.println("현재 속도 :" + speed);
	}
	
	public void turnLeft() {
		System.out.println("좌회전을 합니다.");
		for(int i=speed; i>30; i-=10) {
			speed -= i;
			System.out.println("현재 속도 :" + speed);
		}
	}
	public void turnRight() {
		System.out.println("우회전을 합니다.");
		for(int i=speed; i>30; i-=10) {
			speed -= i;
			System.out.println("현재 속도 :" + speed);
		}
	}

}