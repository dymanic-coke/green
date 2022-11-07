package practice;

import java.util.Scanner;
public class F {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력한 숫자: ");
		String a = scan.nextLine();
		int b = Integer.parseInt(a);
		int i =0;
		
		for(i=2; i<=b; i++) {
			if(b%i == 0) {
				break;
			}
		}
			if(i == b) {
				System.out.println(b + "는 소수입니다.");
			} else {
			System.out.println(b + "는 소수가 아닙니다.");
			}
	
	}

}
