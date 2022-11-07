package sec01.exam03;

import java.util.Scanner;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하시오");
		System.out.print("점수: ");
		int score = Integer.parseInt(scanner.nextLine());
		
		if(score >= 90) {
			System.out.println("점수가 90~100점 입니다.");
			System.out.println("등급은 A 입니다.");
		} else if(score >= 80) {
			System.out.println("점수가 80~89점 입니다.");
			System.out.println("등급은 B 입니다.");
		} else if(score >= 70) {
			System.out.println("점수가 70~79점 입니다.");
			System.out.println("등급은 C 입니다.");
		} else {
			System.out.println("점수가 70점 미만 입니다.");
			System.out.println("등급은 D 입니다.");
		}
	}

}
