package sec02.exam04;

public class Anonymous {
	
	private int field;
	
	public void method(int arg1, int arg2) {
		int var1 = 10;
		int var2 = 5;
		
		field = 12;
		
		//arg1 = 10;  수정불가
		//arg2 = 20;  수정불가
		
		//var1 = 30;  수정불가
		//var2 = 40;  수정불가
		
		Calculator cal = new Calculator() {
			
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		
		System.out.println(cal.sum());
	}
}
