package sec02.exam09;

import java.util.Scanner;

public class LogicalOperatorExample2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("찾으려는 문자:");
		String str = scanner.nextLine();
		char x = str.charAt(0);
		
		int charCode = x;
		
		System.out.println("문자 " + x +"는 무엇인가요?");
		
		System.out.println("int형 유니코드는 " + charCode + "입니다.");
		

		if((charCode>=65) && (charCode<=90)) {
			System.out.println("문자의 형태는 대문자입니다.");
		} else if((charCode>=97) && (charCode<=122)) {
			System.out.println("문자의 형태는 소문자입니다.");
		} else if (!(charCode<48) && !(charCode>57)) {
			System.out.println("문자의 형태는 0~9 숫자 입니다.");
		} else if ((charCode>=44032) && (charCode<=55203)) {
			System.out.println("문자의 형태는 한글입니다.");
		} else {
			System.out.println("문자의 형태를 확인하기 어렵습니다.");
		}
		
	}

}
