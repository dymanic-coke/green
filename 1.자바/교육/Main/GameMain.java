package Main;

import java.util.*;

import Character.*;

import Map.*;

public class GameMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		NormalCharacter hero = new NormalCharacter();
		int num;
		
		while(true) {
		System.out.println("--------게임 시작--------");
		System.out.println("1.전사");
		System.out.println("2.마법사");
		System.out.println("3.궁수");
		System.out.print("직업을 선택하세요.(번호선택) :");
		num = scan.nextInt();
		
		if(num == 1) {
			System.out.println("전사를 선택하였습니다.");
			hero = new Worrier();
			hero.level = 1;
			hero.power = 10;
			hero.defense = 20;
			hero.hp = 150;
			hero.mp = 50;
			break;
		}else if(num == 2) {
			System.out.println("마법사를 선택하였습니다.");
			hero = new Wizard();
			hero.level =1;
			hero.power = 20;
			hero.defense = 10;
			hero.hp = 100;
			hero.mp = 100;
			break;
		} else if(num ==3) {
			System.out.println("궁수를 선택하였습니다.");
			hero = new Archer();
			hero.level = 1;
			hero.power = 15;
			hero.defense = 15;
			hero.hp = 120;
			hero.mp = 70;
			break;
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
		
		System.out.print("이름을 입력하세요 :");
		hero.name = scan.next();
		System.out.println("이름이 입력되었습니다.");
		System.out.println("게임을 시작합니다.");
		
		while(true) {
			System.out.println("-----------------------");
			System.out.println("이름 : " + hero.name);
			System.out.println("현재 레벨 : " + hero.level);
			System.out.println("현재 공격력 : " + hero.power);
			System.out.println("현재 방어력 : " + hero.defense);
			System.out.println("현재 체력 : " + hero.hp);
			System.out.println("현재 마나 : " + hero.mp);
			System.out.println("현재 경험치 : " + hero.exp);
			System.out.println("현재 보유금액 : " + hero.money);
			System.out.println("-----------------------");
			
			System.out.println("1.사냥터");
			System.out.println("2.무기상점");
			System.out.println("3.포션상점");
			System.out.print("입장할 장소를 선택해 주세요.(번호입력):");
			num = scan.nextInt();
			
			Random random = new Random();
			Monster monster = new Monster();
			if(num == 1) {
				System.out.println("사냥터에 입장하였습니다.");				
				int monsterNo = random.nextInt(4)+1;
				
				if(monsterNo == 1) {
					monster = new Goblin();
					monster.name = "고블린";
					monster.level = 1;
					monster.power = 5;
					monster.defense = 5;
					monster.hp = 50;
					monster.mp = 0;
					monster.money = random.nextInt(9)+1;
					monster.exp = 5;
					System.out.println(monster.name + "와 전투를 시작합니다.");
				}
				if(monsterNo == 2) {
					monster = new Ork();
					monster.name = "오크";
					monster.level = 5;
					monster.power = 10;
					monster.defense = 15;
					monster.hp = 100;
					monster.mp = 0;
					monster.money = random.nextInt(10)+10;
					monster.exp = 20;
					System.out.println(monster.name + "와 전투를 시작합니다.");
				}
				if(monsterNo == 3) {
					monster = new Ogre();
					monster.name = "오우거";
					monster.level = 15;
					monster.power = 30;
					monster.defense = 20;
					monster.hp = 200;
					monster.mp = 0;
					monster.money = random.nextInt(10)+10;
					monster.exp = 50;
					System.out.println(monster.name + "와 전투를 시작합니다.");
				}
				if(monsterNo == 4) {
					monster = new Wyvern();
					monster.name = "와이번";
					monster.level = 30;
					monster.power = 40;
					monster.defense = 25;
					monster.hp = 300;
					monster.mp = 0;
					monster.money = random.nextInt(50)+20;
					monster.exp = 150;
					System.out.println(monster.name + "와 전투를 시작합니다.");
				}
				if(monsterNo == 5) {
					monster = new Dragon();
					monster.name = "드래곤";
					monster.level = 50;
					monster.power = 100;
					monster.defense = 50;
					monster.hp = 1000;
					monster.mp = 0;
					monster.money = random.nextInt(100)+100;
					monster.exp = 150;
					System.out.println(monster.name + "와 전투를 시작합니다.");
				}
				
				while(true) {
					System.out.println(hero.name + "의 공격!");
					monster.attacked(hero.attack());
					
					if(monster.hp <= 0) {
						System.out.println(monster.name + "이(가) 죽었습니다.");
						hero.exp += monster.exp;
						hero.money += monster.money;
						break;
					}
					System.out.println(monster.name + "의 공격!");
					hero.attacked(monster.attack());
					
					if(hero.hp <=0) {
						System.out.println(hero.name + "가 사망하였습니다.");
						hero.hp = 1;
						hero.exp = 0;
							if(hero.money < 10) {
								hero.money = 0;
							}else {
							hero.money -= 10;
							}
						System.out.println(hero.name +"이 체력" + hero.hp +"로 부활 했습니다.");
						break;
					}
				}				
			}else if(num == 2) {
				WeponStore store = new WeponStore();
				System.out.println("무기 상점에 입장하였습니다.");
				System.out.println("1.숏소드(50원)");
				System.out.println("2.롱소드(150원)");
				System.out.println("3.완드(50원)");
				System.out.println("4.쿼터스태프(150원)");
				System.out.println("5.숏보우(50원)");
				System.out.println("6.롱보우(150원)");
				System.out.print("원하시는 물건을 선택하세요 :");
				
				num = scan.nextInt();
				int temp = hero.money;
				
				if((hero.money = store.show(hero.money, num)) < -1) {
					System.out.println("구입이 완료 되었습니다.");
					
					if(num == 1) {
						hero.power += 5;
					}
					if(num == 2) {
						hero.power += 15;
					}
					if(num == 3) {
						hero.power += 5;
					}
					if(num == 4) {
						hero.power += 15;
					}
					if(num == 5) {
						hero.power += 5;
					}
					if(num == 6) {
						hero.power += 15;
					}
					System.out.println(temp + "원 남았습니다.");
				}else {
					System.out.println("돈이 부족합니다.");
					System.out.println("현재 보유액 : " + temp);
				}
				
				
			} else if(num ==3) {
				PotionStore poStore = new PotionStore();
				System.out.println("포션 상점에 입장하였습니다.");
				System.out.println("1.파워상승포션(50원)");
				System.out.println("2.방어상승포션(50원)");
				System.out.println("3.경험치포션(100원)");
				System.out.println("4.체력회복포션(10원)");
				System.out.println("5.마나회복포션(10원)");
				System.out.print("원하시는 물건을 선택하세요 :");
				
				num = scan.nextInt();
				int temp = hero.money;
				
				if((hero.money = poStore.show(hero.money, num)) < -1) {
					System.out.println("구입이 완료 되었습니다.");
					
					if(num == 1) {
						hero.power += 3;
					}
					if(num == 2) {
						hero.defense += 15;
					}
					if(num == 3) {
						hero.exp += 30;
					}
					if(num == 4) {
						hero.hp += 20;				
					}
					if(num == 5) {
						hero.mp += 5;
					}
					System.out.println(temp +"원 남았습니다.");
			}else {
				System.out.println("돈이 부족합니다.");
				System.out.println(temp + "원 남았습니다.");
			}
		}
			if(hero.exp >= hero.level*100) {
				hero.level++;
				System.out.println(hero.name + "의 레벨업!!");
				System.out.println("현재 레벨 :" + hero.level);
				hero.power += 1;
				hero.defense +=2;
				System.out.println("힘 상승!!");
				System.out.println("현재 힘 : " + hero.power);
				System.out.println("방어력 상승!!");
				System.out.println("현재 방어력 : " + hero.defense);
				hero.exp = 0;
			}
	}

}
}
	

