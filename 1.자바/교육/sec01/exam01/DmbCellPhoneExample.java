package sec01.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		
		//DmbCellPhone 객체 생성
		CameraDmbCellPhone cameraDmbCellPhone = new CameraDmbCellPhone("자바폰", "검정", 1, 10);
		
		//CellPhone으로부터 상속 받은 필드
		System.out.println("모델 : " + cameraDmbCellPhone.model);
		System.out.println("색상 : " + cameraDmbCellPhone.color);
		
		//DmbCellPhone으로부터 상속받은 필드
		System.out.println("채널 : " + cameraDmbCellPhone.channel);
		
		//CameraDmbCellPhone의 필드
		System.out.println("카메라배율 : " + cameraDmbCellPhone.camera);
		
		//CellPhone으로부터 상속 받은 메소드
		cameraDmbCellPhone.powerOn();
		cameraDmbCellPhone.bell();
		cameraDmbCellPhone.sendVoice("여보세요");
		cameraDmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요");
		cameraDmbCellPhone.sendVoice("아~ 예 반갑습니다.");
		cameraDmbCellPhone.hangUp();
		
		//DmbCellPhone의 메소드 호출
		cameraDmbCellPhone.turnOnCamera();
		cameraDmbCellPhone.zoomInCamera(3);
		cameraDmbCellPhone.zoomOutCamera(0.5);
		cameraDmbCellPhone.turnOffCamera();
	}

}
