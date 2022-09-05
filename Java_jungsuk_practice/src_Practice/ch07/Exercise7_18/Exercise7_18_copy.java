package ch07.Exercise7_18;

public class Exercise7_18_copy {
	
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		
		for(int i = 0; i < arr.length; i++)
			arr[i].action();
		

	}
	
	
	
}


class Robot {
	void action() {
		
	}
}

class DanceRobot extends Robot {
	void action() {
		System.out.println("춤을 춥니다.");
	}
	
}

class SingRobot extends Robot {
	void action( ) {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	void action() {
		System.out.println("그림을 그립니다.");
	}
}