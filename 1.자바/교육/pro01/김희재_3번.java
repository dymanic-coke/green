package pro01;

public class 김희재_3번 {

	public static void main(String[] args) {
		
		int[] scores;
		scores = new int[] {83, 90, 87};
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합: " + sum1);
		int sum2 = add(scores);
		System.out.println("총합: " + sum2);
		System.out.println();
	}
	
	public static int add(int[] scores) {
		int sum2 = 0;
		for(int i=0; i<3; i++) {
			sum2 += scores[i];
		}
		return sum2; 
	}

}
