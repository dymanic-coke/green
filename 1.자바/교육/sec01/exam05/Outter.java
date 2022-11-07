package sec01.exam05;

public class Outter {
	
	String field = "Otter의 필드";
	
	void method() {
		System.out.println("Outter클래스의 method 실행");
	}
	
	class nested{
		String field = "nested의 필드";
		
		void method() {
			System.out.println("nested클래스의 method 실행");
		}
		
		void print() {
			System.out.println(this.field);
			this.method();
			
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
		
	}
}
