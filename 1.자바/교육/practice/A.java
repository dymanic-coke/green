package practice;

public class A {
	public static void main(String[] args) {
	int p;
	int a;
	int o;
	
	p = 5;
	a = 6;
	o = 7;
	
	int sum = p + a + o;
	float avg = sum / 24f;
	
	System.out.println("하루에 생산 되는 과일의 합계: " + sum);
	System.out.println("1시간당 생산되는 과일의 양: " + avg);
	}
}
