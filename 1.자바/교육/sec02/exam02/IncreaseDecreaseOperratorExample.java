package sec02.exam02;

public class IncreaseDecreaseOperratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		x++; //x(10) = x(10)+1
		++x; //x(10) = x(10)+1
		System.out.println("X= " + x); //x = 12
		
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		y--; //y = y-1
		--y; //y = y-1
		System.out.println("Y= " + y); //y = 8
		
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		z = x++; //x(14열까지의 계산값 12) 
		System.out.println("Z= " + z); //후위증감으로 12 
		System.out.println("X= " + x); //후위증감으로 13
		
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		z = ++x; //x(23열까지의 계산값 13)
		System.out.println("Z= " + z); //전위 증가로 14
		System.out.println("X= " + x); //전위 증가로 14
		
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		z = ++x + y++; //x(28열까지의 계산값 14) + y(19열까지의 계산값 8)
		System.out.println("Z= " + z); // x(15)+y(8)
		System.out.println("X= " + x); // x(15)
		System.out.println("Y= " + y); // y(9)
		
	}

}
