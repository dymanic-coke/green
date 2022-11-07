package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열:\t\"" + inputData + "\"");
			if(inputData.equals("done")) {
				break;
			}
		}
		
		System.out.println("사용을 중지합니다.");
	}

}
