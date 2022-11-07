package sec01.exam15;

public class StringIndexOfExample {

	public static void main(String[] args) {
		
		String sub = "자바 프로그래밍";
		
		int loca = sub.indexOf(" ");
		System.out.println(loca);
		
		if(sub.indexOf(" ") != -1) {
			System.out.println("자바와 관련된 책입니다.");
		} else {
			System.out.println("자바와 관련없는 책입니다.");
		}
	}

}
