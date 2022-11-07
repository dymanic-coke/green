package practice;

public class Cylinder {
	public static void main(String[] args) {
		
		CylinderMethod cyme = new CylinderMethod();
		
		double r = 3.5;
		double h = 10;
		double v = cyme.volume(r,h);
		
		System.out.printf("반지름이 %.1f, 높이 %.1f인 원기둥의 부피: %.2f", r, h, v);
	}

}
