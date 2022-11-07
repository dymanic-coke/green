package ch06.ex6_8;

public class Ex6_8 {

	public static void main(String[] args) {
		
		int[][] dan = new int[10][10];
		
		for(int i=0; i<=9; i++) {
			for(int x=0; x<=9; x++) {
				dan[i][x] = i * x;
			}
		}
		
		System.out.printf("2X7 = %d\n", dan[2][7]);
		System.out.printf("7X8 = %d\n", dan[7][8]);
	}

}
