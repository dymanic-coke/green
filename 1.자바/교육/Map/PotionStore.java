package Map;

public class PotionStore extends Map{
	
	int powerPo = 50;
	int defensePo = 50;
	int expPo = 100;
	int hpPo = 10;
	int mpPo = 10;
	
	public int show(int money, int num) {
		
		name = "포션 상점";
		System.out.println(name + "에서 물건을 구매 시도하는 중입니다.");
		
		if(num == 1) {
			if(powerPo <= money) {
				return money-powerPo;
			}
		}
		if(num == 2) {
			if(defensePo <= money) {
				return money-defensePo;
			}
		}
		if(num == 3) {
			if(expPo <= money) {
				return money-expPo;
			}
		}
		if(num == 4) {
			if(hpPo <= money) {
				return money-hpPo;
			}
		}
		if(num == 5) {
			if(mpPo <= money) {
				return money-mpPo;
			}
		}
		return money;
	}
}
