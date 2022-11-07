package sec01.exam13;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		String str1 = new String("김희재");
		String str2 = "김희재";
		
		if(str1 == str2) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}
		
		if(str1.equals(str2)) {
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("다른 문자열을 가짐");
		}
	}

}
