package sec01.exam01;

public class Example {

	public static void main(String[] args) {
		
		A a = new A();
		
		//인스턴스 멤버클래스 객체 생성 및 메소드 실행
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		//정적 멤버클래스 객체 생성 및 메소드 실행
		
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		//로컬클래스 객체 생성 및 메소드 실행을 위한 메소드 호출
		
		a.method();
	}

}
