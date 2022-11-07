package sec04.verify.exam03;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력]");
		
		System.out.print("1. 이름: ");
		String name = scanner.nextLine();
		
		System.out.print("2. 생년월일: ");
		String ssn = scanner.nextLine();
		
		System.out.print("3. 전화번호: ");
		String tel = scanner.nextLine();
		
		System.out.println();
		
		System.out.println("[작성 내용]");
		System.out.println("1. 성명:\t" + name);
		System.out.println("2. 생년월일: " + ssn + "생");
		System.out.println("3. 연락처: " + tel);
		
	}

}
