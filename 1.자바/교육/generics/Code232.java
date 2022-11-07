package generics;

class WithWild<A extends Number>{
	A data;
	
	WithWild(A d1){
		data = d1;
	}
	
	boolean same(WithWild<?> x) {
		if(Math.abs(data.doubleValue()) == Math.abs(x.data.doubleValue())) {
			return true;
		} 
		return false;
	}
}

public class Code232 {

	public static void main(String[] args) {
		
		WithWild <Integer> a = new WithWild<Integer>(6);
		WithWild <Double> b = new WithWild<Double>(-6.0);
		WithWild <Long> c = new WithWild<Long>(5L);
		
		if(a.same(b)) {
			System.out.println("a와 b는 같습니다.");
		} else {
			System.out.println("a와 b는 다릅니다.");
		}
		
		if(a.same(c)) {
			System.out.println("a와 c는 같습니다.");
		} else {
		System.out.println("a와 c는 다릅니다.");
		}
	}

}
