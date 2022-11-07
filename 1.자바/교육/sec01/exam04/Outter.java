package sec01.exam04;

public class Outter {
	
	//자바 7 이전
	public void method1(final int arg) {
		final int localVariable = 1;
		//arg = 100;
		//localVariable = 100;
		class Inner{
			public void method() {
				int result = arg + localVariable;
				System.out.println(result);
			}
		}
		Inner inner = new Inner();
		inner.method();
	}
	
	//자바 8 이후
	public void method2(int arg) {
		int localVariable = 1;
		// arg = 100; 매개변수 부분에 final이 생략되어 있음
		// localVariable = 100; 매개변수 부분에 final이 생략 되어 있음
		class Inner2{
			public void method() {
				int result = arg + localVariable;
				System.out.println(result);
			}
		}
		Inner2 inner2 = new Inner2();
		inner2.method();
	}
}
