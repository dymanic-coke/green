package sec05.exam05;

public class PersonExample {

	public static void main(String[] args) {
		
		Person p1 = new Person("123465-8888888", "김희재");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		p1.name = "홍삼원";
//		p1.nation = "usa"; final 필드로서 이미 코리아로 초기화 되어 수정이 불가능
//		p1.ssn = "212222-2222222"; 위와 동일 
	}

}
