package sec02.verify.exam11;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디: ");
		String name = scanner.nextLine();
		
		System.out.print("비밀번호: ");
		String strpassward = scanner.nextLine();
		
		
		if(name.equals("김희재")) {
			if(strpassward.equals("kook1988")) {
				System.out.println("로그인에 성공했습니다.");
			} else {
				System.out.println("로그인 실패 : 비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("로그인 실패 : 아이디가 틀렸습니다.");
		}
	}

}
