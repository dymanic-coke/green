package practice;

public class E {

	public static void main(String[] args) {
		
		for(int a=1; a<=10; a++) {
			for(int b=0; b<10; b++){
				int sum = a + b;
				if(sum>10) {
					sum-=10;
				}
				System.out.printf("%d ", sum);
			}
			System.out.println();
		}
	}

}
