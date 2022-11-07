package Character;

public class Wyvern extends Monster {
	
	public int attack() {
		System.out.println("데미지 : " + power + "만큼 피해를 줍니다.");
		return power;
	}
	
	public void attacked(int sum) {
		if(defense >= sum) {
			hp = hp-0;
		} else {
			hp = hp+defense-sum;
		}
	}
	
}