package sec01.exam19;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		
		String str1 = "java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		String upperStr1 = str1.toUpperCase();
		String upperStr2 = str2.toUpperCase();
		
		System.out.println(upperStr1.equals(upperStr2));
		
		System.out.println(str1.equalsIgnoreCase(str2));
	}

}
