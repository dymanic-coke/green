package sec01.exam01;

public class CameraDmbCellPhone extends CellPhone {
	
	int channel;
	double camera;
	
	
	CameraDmbCellPhone(String model, String color, double camera, int channel){
		this.model = model;
		this.color = color;
		this.camera = camera;
		this.channel = channel;
	}
		void turnOnCamera() {
			System.out.println("카메라 프로그램을 킵니다.");
		}
		void zoomInCamera(double camera) {
			this.camera = camera;
			System.out.println("카메라를 " + camera + "배로 확대합니다.");
		}
		void zoomOutCamera(double camera) {
			this.camera = camera;
			System.out.println("카메라를 " + camera + "배로 축소합니다.");
		}
		void turnOffCamera() {
			System.out.println("카메라 프로그램을 닫습니다.");
		}

}
