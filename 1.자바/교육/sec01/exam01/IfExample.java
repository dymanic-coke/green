package sec01.exam01;

public class IfExample {

	public static void main(String[] args) {
		
		int score = 93;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		if(score < 90) { //중괄호가 없을 경우 14열은 작동을 안하고 15열이 작동을함
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");
		}
	}

}
