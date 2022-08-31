package ch06;

public class Ex06_07 {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,1);
		
		System.out.println(p.getDistance(2,2));
		
		MyPoint p2 = new MyPoint(2,2);
		System.out.println(p.getDistance(p2));

	}

}


class MyPoint{
	int x;
	int y;
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}	
		
	double getDistance(int x1, int y1) {
//		return (double)Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y));
		return (double)Math.sqrt((x1-this.x)*(x1-this.x) + (y1-this.y)*(y1-this.y));

	}
	
	
	double getDistance(MyPoint point) {
		return (double)Math.sqrt((this.x-point.x)*(this.x-point.x) + (this.y-point.y)*(this.y-point.y));
	}

	
}