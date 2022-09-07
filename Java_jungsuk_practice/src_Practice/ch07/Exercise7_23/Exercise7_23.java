package ch07.Exercise7_23;

//import ch07.Exercise7_22.Circle;
//import ch07.Exercise7_22.Exercise7_22;
//import ch07.Exercise7_22.Rect;
//import ch07.Exercise7_22.Shape;
//import ch07.Exercise7_22.Point;
import ch07.Exercise7_22.*;


public class Exercise7_23 {
	
	
	public static double sumArea(Shape[] arr) {
		double sum = 0;
		
		for(int i=0; i < arr.length; i++) {
			sum += arr[i].calcArea();
		}
		
		return sum;
	}
	
	
	

	public static void main(String[] args) {
		
		Shape[] arr = {
				new Circle(5.0),
				new Rect(3,4),
				new Circle(1)
				};
		System.out.println("면적의 합 : "+sumArea(arr));

	}

}
