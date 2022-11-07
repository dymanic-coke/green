package sec01.exam04;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl rc = null;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(15);
		rc.turnOff();
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(-10);
		rc.turnOff();
	}

}
