package sec03.exam03;

public class Car {
	
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxspeed;
	
	//생성자
	Car(){
	}
	
	Car(String model){
		this(model, null, 0);
	}
	
	Car(String model, String color){
		this(model, color, 0);
	}
	
	Car(String model, String color, int maxspeed){
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}
	
}
