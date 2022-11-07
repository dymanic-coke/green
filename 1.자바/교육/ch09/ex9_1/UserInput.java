package ch09.ex9_1;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1. 이름 :");
		String name = scanner.next();
		System.out.print("2. 학번 :");
		String num = scanner.next();
		System.out.print("3. 학점 :");
		double grade = scanner.nextDouble();
		System.out.printf("[%s]님의 학번은 %s이며, 학점은 %.2f 입니다.", name, num, grade);
		
	}

}
