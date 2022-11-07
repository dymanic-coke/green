package generics;

class TwoGenerics<A, B>{
	
	A data1;
	B data2;
	
	TwoGenerics(A d1, B d2){
		data1 = d1;
		data2 = d2;
	}
	
	void showGenericsType() {
		System.out.println("Type of A: "+ data1.getClass().getName());
		System.out.println("Type of B: " + data2.getClass().getName());
	}
	
	A getData1() {
		return data1;
	}
	B getData2() {
		return data2;
	}
}


public class Code230 {
	public static void main(String[] args) {
		TwoGenerics<Integer, String> x = new TwoGenerics<Integer, String>(100, "안녕");
		
		x.showGenericsType();
		int a = x.getData1();
		System.out.println("value: " + a);
		String b = x.getData2();
		System.out.println("value: " + b);
	}

}

