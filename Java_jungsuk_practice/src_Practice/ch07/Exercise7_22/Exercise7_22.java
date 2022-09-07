package ch07.Exercise7_22;

public abstract class Shape {
	
	public Point p;
	
	public Shape() {
		this(new Point(0,0));
	}
	
	public Shape(Point p) {
		this.p = p;
	}
	
	public abstract double calcArea();
	
	public Point getPosition() {
		return p;
	}
	
	public void setPosition(Point p) {
		this.p = p;
	}
	
}







public class Exercise7_22 {

	public static void main(String[] args) {
		Rect rect = new Rect();
		System.out.println(rect);
		System.out.println(new Rect(new Point(3,2)));
		System.out.println(rect.isSquare());
		System.out.println(new Rect(1.0, 2.9).isSquare());

	}

}
