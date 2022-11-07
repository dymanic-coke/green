package sec02.exam11;

public class ConditionalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 95;
		String grade = (score > 90) ? "1" : ((score > 80) ? "2" : "과락");
		System.out.println(score + "점은 " + grade + "등급입니다.");
		
	}

}
