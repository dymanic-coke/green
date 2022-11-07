package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		
		Child child = new Child();
		Parent parent = child;
		
		parent.method1();
		parent.method2();
	  //praent.method3(); 자동타입변환으로 자식 메소드 호출 불가능
		
		
	}

}
