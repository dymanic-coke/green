package practice;

public interface Break {
	
	int MAX_SPEED = 200;
	int MIN_SPEED = 0;
	
	void goForward (boolean go);
	void goBackward (boolean back);
	void stop();
}
