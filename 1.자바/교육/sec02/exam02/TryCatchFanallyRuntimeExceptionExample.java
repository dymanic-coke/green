package sec02.exam02;

public class TryCatchFanallyRuntimeExceptionExample {

	public static void main(String[] args) {
		
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];
			data2 = args[1];
		}catch(ArrayIndexOutOfBoundsException x) {
			System.out.println("실행 할려는 매개값의 수가 부족합니다.");
			return;
		}
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
		}catch(NumberFormatException a) {
			System.out.println("숫자가 아닌값이 있는데요?");
		} finally {
			System.out.println("다시 실행 하세요");
		}
	}

}
