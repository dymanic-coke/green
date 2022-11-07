package practice;

public class C {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		int sum = 0;
		if(a>b) {
			int temp = a;
			a = b;
			b = temp;
		}
		for(int i=a; i<=b; i++) {
			sum += i;
		}
		System.out.println("a부터 b의 합계:" + sum);
	}

}
