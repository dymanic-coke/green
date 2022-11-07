package practice;

import java.util.Scanner;
public class B {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("정수의 값 :" );
	String a;
	a = scan.nextLine();
	int b = Integer.parseInt(a);
	int sum = 0;
	
	for(int i=1; i<=b; i++) {
		sum += i;
	}
	System.out.println("정수의 합:" + sum);
	}
}
