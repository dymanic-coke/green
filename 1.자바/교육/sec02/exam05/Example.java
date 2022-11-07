package sec02.exam05;

public class Example {

	public static void main(String[] args) {
		
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();
//		ia.methodB(); 메소드B는 InterfaceB타입으로 관계가 없어 실행불가
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
//		ib.methodA(); 메소드A는 InterFaceA타입으로 관계가 없어 실행불가
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA(); // InterfaceC의 경우 A와 B를 상속받았음으로 사용가능
		ic.methodB(); // InterfaceC의 경우 A와 B를 상속받았음으로 사용가능
		ic.methodC(); // InterfaceC의 경우 A와 B를 상속받았음으로 사용가능
	}

}
