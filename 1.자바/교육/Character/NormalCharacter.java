package Character;

public class NormalCharacter extends Character {
	
	public int power;
	public int defense;
	public int money = 0;
	public int exp = 0;
	
	public int attack() {
		return power;
	}
	
	public void attacked(int sum) {
		if(defense >= sum) {
			hp = hp -0;
		}else {
			hp = hp+defense - sum;
		}
	}
}
