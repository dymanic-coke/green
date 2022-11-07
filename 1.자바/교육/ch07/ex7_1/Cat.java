package ch07.ex7_1;

public class Cat {
	
	String name; //고양이 이름
	String breeds; //품종
	double weight; // 고양이 몸무게
	
	void claw() {
		System.out.println("할퀴기!!");
	}
	
	void meow() {
		System.out.println("야옹~~");
	}
	

	public static void main(String[] args) {
		Cat c = new Cat();
		
		c.name = "야옹이";
		c.breeds = "러시안블루";
		c.weight = 3.89;
		
		System.out.printf("이름: %s\n", c.name);
		System.out.printf("품목: %s\n", c.breeds);
		System.out.printf("체중: %.2fkg\n", c.weight);
	}

}
