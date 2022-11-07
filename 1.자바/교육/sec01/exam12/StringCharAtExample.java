package sec01.exam12;

public class StringCharAtExample {

	public static void main(String[] args) {
		
		String ssn = "123456-3234567";
		char sex = ssn.charAt(7);
		if(sex == '1'|| sex == '2' || sex =='3' || sex =='4') {
		switch(sex) {
		case '1':
		case '2':
			System.out.println("남자 입니다.");
		break;	
		case '3':
		case '4':
			System.out.println("여자 입니다.");
			break;
		}
	} else {
		System.out.println("입력을 잘못하셨습니다.");
	}

}
}
