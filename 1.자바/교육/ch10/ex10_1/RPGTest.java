package ch10.ex10_1;

import java.util.Random;

class Nomal {
	Random random = new Random();
	String name;
	int hp;
	void punch() {
		if(random.nextBoolean()) {
			System.out.println("공격성공!");
			System.out.println("주먹으로 공격합니다.");
			int damege = random.nextInt(10);
			System.out.println("주먹: " + damege + "의 데미지를 주었습니다.");
		} else {
			System.out.println("공격실패");
		}
		
	}
}

class Wizard extends Nomal {
	int mp;
	
	void fireball() {
		if(random.nextBoolean()) {
			System.out.println("공격성공!");
			System.out.println("파이어볼을 날립니다.");
			int damege = random.nextInt(10) + 10;
			System.out.println("파이어볼: " + damege + "의 데미지를 주었습니다.");
		} else {
			System.out.println("공격실패");
		}
	}
}

public class RPGTest {

	public static void main(String[] args) {
		Wizard wizard = new Wizard();
		wizard.name = "테스트";
		wizard.hp = 100;
		wizard.mp = 50;
		wizard.punch();
		wizard.fireball();
	}

}
