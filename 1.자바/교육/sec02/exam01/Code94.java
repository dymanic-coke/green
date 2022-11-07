package sec02.exam01;

class Dog {
	
	String name;
	String kind;
	String sexuel;
	int age;
}

public class Code94 {

	public static void main(String[] args) {
		
		Dog happy = new Dog();
		Dog bella = new Dog();
		happy.name = "해피";
		happy.kind = "시베리아 허스키";
		happy.sexuel = "수컷";
		happy.age = 2;
		
		bella.name = "벨라";
		bella.kind = "말라뮤트";
		bella.sexuel = "암컷";
		bella.age = 3;
		
		System.out.println("두 마리의 강아지가 살고 있습니다.");
		System.out.println("한 마리의 이름은 " + happy.name + "이고 종은 "
							+ happy.kind + "이며 성별은 " + happy.sexuel +
							"이고 나이는 " + happy.age + "살 입니다.");
		System.out.println("한 마리의 이름은 " + bella.name + "이고 종은 "
				+ bella.kind + "이며 성별은 " + bella.sexuel +
				"이고 나이는 " + bella.age + "살 입니다.");
	}

}
