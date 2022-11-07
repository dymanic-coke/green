package generics;

class Data<A extends Number>{
	A obj;
	Data(A ob){
		obj = ob;
	}
	
	int CalcMultiple(int n) {
		return obj.intValue() * n;
	}
}


public class Code231 {

	public static void main(String[] args) {
		Data<Integer> a = new Data<Integer>(100);
		int result = a.CalcMultiple(7);
		System.out.println(result);
		
		Data<Double> b = new Data<Double>(34.2);
		int result2 = b.CalcMultiple(7);
		System.out.println(result2);
		
	}

}
