package sec04.exam03;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.setoil(10);
		
		boolean oilState = myCar.isLeftOil();
		if(oilState) {
			System.out.println("출발합니다.");
			myCar.action();
		}
		
		if(myCar.isLeftOil()) {
			System.out.println("기름이 들어있습니다.");
		} else {
			System.out.println("주유를 위해 주유소를 방문하세요");
		}
		
	}

}
