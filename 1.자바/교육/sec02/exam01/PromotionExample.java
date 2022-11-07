package sec02.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		
		B b = new B();
		E e = new E();
		C c = new C();
		D d = new D();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = e;
		C c1 = d;
		
		//상속 받을수 없는 관계 는 오류
		// B b2 = d;
		// C c2 = e;
		
	}

}
