package ch10.ex10_1;

import java.util.Random;
import java.util.Scanner;

public class Skill {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("공격 하시겠습니까? (Y / N)");
		String attack = scan.nextLine();
		switch(attack) {
		case "y":
			System.out.println("공격을 시작합니다.");
			System.out.println("공격스킬:");
			System.out.println("1.일반공격");
			System.out.println("2.파이어볼");
			System.out.println("3.아이스볼");
			System.out.println("4.라이트닝볼");
			System.out.print("선택:");
			String skillNum = scan.nextLine();

			switch(skillNum) {
		
			case "1":
				if(random.nextBoolean()) {
					System.out.println("공격성공!");
					System.out.println("주먹으로 공격합니다.");
					int damege = random.nextInt(10)+1;
					System.out.println("일반공격: " + damege + "의 데미지를 주었습니다.");
				} else {
					System.out.println("공격실패");
				}
				break;
			case "2":
				if(random.nextBoolean()) {
					System.out.println("공격성공!");
					System.out.println("파이어볼로 공격합니다.");
					int damege = random.nextInt(20)+1;
					System.out.println("파이어볼: " + damege + "의 데미지를 주었습니다.");
				} else {
					System.out.println("공격실패");
				}
				break;
			case "3":
				if(random.nextBoolean()) {
					System.out.println("공격성공!");
					System.out.println("아이스볼로 공격합니다.");
					int damege = random.nextInt(20)+1;
					System.out.println("아이스볼: " + damege + "의 데미지를 주었습니다.");
				} else {
					System.out.println("공격실패");
				}
				break;
			case "4":
				if(random.nextBoolean()) {
					System.out.println("공격성공!");
					System.out.println("라이트닝볼로 공격합니다.");
					int damege = random.nextInt(20)+1;
					System.out.println("라이트닝볼: " + damege + "의 데미지를 주었습니다.");
				} else {
					System.out.println("공격실패");
				}
				break;
		}
		case "n":
			break;
	}
	}
}

