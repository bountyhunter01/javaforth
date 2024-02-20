package Circle;

public class Circle {
	public double radius;
	public static double PI = 3.141592;

	public Circle(double radius1) {

		this.radius = radius1;
	}

	public double getArea() {
		return radius * radius *PI;
	}
	
}
