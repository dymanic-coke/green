package practice;

public class CylinderMethod {
	
	double radius;
	double height;
	
	
	double volume(double radius, double height) {
		this.radius = radius;
		this.height = height;
		
		double result = Math.PI * radius * radius * height;
		return result;
		
	}
}
