package sec01.exam08;

public class ClassExample {

	public static void main(String[] args) throws Exception {
		
		// 클래스 객체 정보 얻기 1번
//		Class clazz = Car.class;
		
		// 클래스 객체 정보 얻기 2번
		Class clazz = Class.forName("sec01.exam08.Car");
		
		//클래스 객체 정보 얻기 3번
//		Car car = new Car();
//		Class clazz = car.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
		
	}

}
