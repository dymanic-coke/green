package sec03.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		 
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intvalue:\t" + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("\"가\"의 유니코드:\t" + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue:\t" + longValue);
		
		longValue = 100L;
		float floatValue  = longValue;
		System.out.println("floatValue:\t" + floatValue);
		
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("doubleValue:\t" + doubleValue);

	}

}
