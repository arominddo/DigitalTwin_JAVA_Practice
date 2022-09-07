package ch07.Exercise7_22;

public class Rect extends Shape {
	
	public double width;
	public double height;
	
	public Rect(double width, double height) {
		this(new Point(0,0), width, height);
	}
	
	public Rect(Point p, double width, double height) {
		super(p);
		this.width = width;
		this.height = height;
	}
	
	public boolean isSquare() {
		return width*height != 0 && width==height;
	}
	
	public double calcArea() {
		return width * height;
	}

}
