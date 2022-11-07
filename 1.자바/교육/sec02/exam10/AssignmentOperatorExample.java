package sec02.exam10;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = 0;
		result += 10; // result(0)에 10을 더하고 result에 다시 대입
		System.out.println("result=" + result); 
		result -= 5; // result(10)에 5을 빼고 result에 다시 대입
		System.out.println("result=" + result);
		result *= 3; // result(5)에 3을 곱하고 result에 다시 대입
		System.out.println("result=" + result);
		result /= 5; // result(15)에 5를 나누고 result에 다시 대입
		System.out.println("result=" + result);
		result %= 3;
		System.out.println("result=" + result);
	}

}
