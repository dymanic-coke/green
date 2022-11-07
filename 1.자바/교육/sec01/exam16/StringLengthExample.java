package sec01.exam16;

public class StringLengthExample {

	public static void main(String[] args) {
		
		String ssn = "123456-1234567";
		int leng = ssn.length();
		if(leng == 13|| leng == 14) {
			switch(leng) {
			case 14:
			System.out.println("주민번호입니다.");
			break;
			case 13:
				System.out.println("전화번호입니다.");
				break;
		} 
	}

}
}
