package sec04.exam03;

public class Car {
	
	//필드
	int oil;
	
	//생성자 없음
	
	//메소드
	void setoil(int oil) {
		this.oil = oil;
	}
	
	boolean isLeftOil() {
		if(oil == 0) {
			System.out.println("기름이 없습니다.");
			return false;
		}
		System.out.println("기름이 있습니다.");
		return true;
	}
	
	void action() {
		while(true) { //while 구문은 return이 나오기 전까지 작동함
			if(oil > 0) {
				System.out.println("이동합니다.(기름잔량 :" + oil + ")");
				oil--;
			} else {
				System.out.println("정지합니다.(기름잔량 :" + oil + ")");
				return;
			}
		}
	}
}
