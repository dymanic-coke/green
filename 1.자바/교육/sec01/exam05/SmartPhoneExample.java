package sec01.exam05;

public class SmartPhoneExample {

	public static void main(String[] args) {
		
		SmartPhone smartPhone = new SmartPhone("LG", "안드로이드") ;
		
		String strObj = smartPhone.toString();
		System.out.println(strObj);
		System.out.println(smartPhone);
	}

}
