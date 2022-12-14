package ch07.Exercise7_22;

public class Point {
	
	public double x;
	public double y;
	
	public Point() {
		this(0,0);
	}
	
	public Point(double x, double y) {
		this.x=x;
		this.y=y;
	}
	
	public String toString() {
		return "["+x+", "+y+"]";
	}

}
