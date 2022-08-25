package ch04;

public class practice04_04 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0;
		
		while (sum<100) {
			i++;
			sum += i*Math.pow((-1),i-1);
		}
		
		System.out.println(i);
		

	}

}
