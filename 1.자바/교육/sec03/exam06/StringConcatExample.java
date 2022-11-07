package sec03.exam06;

public class StringConcatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value = 10 + 2 + 8;
		System.out.println("value:\t" + value);
		
		String str1 = 10 + 2 + "8";
		System.out.println("str1:\t" + str1);
		
		String str2 = 10 + "2" + 8;
		System.out.println("str2:\t" + str2);
		
		String str3 = "10" + 2 + 8;
		System.out.println("str3:\t" + str3);
		
		String age1 = 1 + 2 + "4";
		System.out.println("나이:\t" + age1);
	}

}
