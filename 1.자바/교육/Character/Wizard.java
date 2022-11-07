package Character;

import java.util.*;

public class Wizard extends NormalCharacter {
	
	@Override
	public int attack() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("---------공격 메뉴----------");
		System.out.println("1.기본공격");
		System.out.println("2.파이어볼");
		System.out.print("공격 번호를 입력하세요 :");
		int skill = scan.nextInt();
		
		int sum = 0;
		
		if(skill == 1) {
			sum += level*1;
			sum += power*1;
			System.out.println("데미지 : "+ sum + "만큼 피해를 입혔습니다.");
			return sum;
		} else if(skill == 2) {
			sum += level*2;
			sum += power*3;
			int temp = mp;
			if(mp > 10) {
		    mp -= 10;	
			System.out.println("데미지 : "+ sum + "만큼 피해를 입혔습니다.");
			return sum;
			}else {
				System.out.println("마나가 부족합니다.");
				System.out.println("현재 마나 : " + temp);
			}
		}
			System.out.println("데미지 : "+ sum + "만큼 피해를 입혔습니다.");
			return sum;

	}	
		public void attacked(int sum) {
			if(defense >= sum) {
				hp = hp -0;
			}else {
				hp = hp+defense - sum;
			}
		}
	}
