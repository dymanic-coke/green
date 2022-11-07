package Map;

public class WeponStore extends Map{
	
	int shortSword = 50;
	int longSword = 150;
	int magicWand = 50;
	int staff = 150;
	int shortBow = 50;
	int longBow = 150;
	
	public int show(int money, int num) {
		
		name = "무기상점";
		System.out.println(name + "에서 물건을 구매 시도하는 중입니다.");
		
		if(num == 1) {
				if(shortSword <= money) {
					return money-shortSword;
				}
		}
		if(num == 2) {
				if(longSword <= money) {
					return money-longSword;
				}
		}
		if(num == 3) {
				if(magicWand <= money) {
					return money-magicWand;
				}
		}
		if(num == 4) {
				if(staff <= money) {
					return money-staff;
				}
		}
		if(num == 5) {
				if(shortBow <= money) {
					return money-shortBow;
				}
		}
		if(num == 5) {
				if(longBow <= money) {
					return money-longBow;
				}
		}
		return money;
	}
}
