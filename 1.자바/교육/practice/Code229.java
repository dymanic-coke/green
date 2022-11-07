package practice;

public class Code229 {

	public static void main(String[] args) {
		
		Data<Integer> k1 = new Data<Integer>(1000);
		System.out.println(k1.getObj());
		k1.showType();
		
		Data<String> k2 = new Data<String>("김희재");
		System.out.println(k2.getObj());
		k2.showType();
	}

}
