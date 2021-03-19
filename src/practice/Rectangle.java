package practice;

public class Rectangle extends Shape {
	private double width;
	private double height;

	public Rectangle() {
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double area() {
		return width * height;
	}
}
