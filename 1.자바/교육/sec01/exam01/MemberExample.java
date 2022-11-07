package sec01.exam01;

public class MemberExample {

	public static void main(String[] args) {
		
		Member obj1 = new Member("안녕");
		Member obj2 = new Member("안녕");
		Member obj3 = obj1;
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 같습니다.");
		} else {
			System.out.println("obj1과 obj2는 다릅니다.");
		}
		
		if(obj1 == obj3) {
			System.out.println("ojb1과 obj3은 같습니다.");
		} else {
			System.out.println("obj1과 obj3은 다릅니다.");
		}
	}

}
