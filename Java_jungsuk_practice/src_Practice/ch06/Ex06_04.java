package ch06;

public class Ex06_04 {

	public static void main(String[] args) {

		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;

		System.out.println("이름:" + s.name);
		System.out.println("총점:" + s.getTotal());
		System.out.println("평균:" + s.getAverage());
	}

}

class Student {
	String name;
	int ban, no, kor, eng, math;

	int getTotal() {
		return this.kor + this.eng + this.math;

	}

	float getAverage() {
		return (int)(getTotal() / 3.0f *10+0.5) / 10.0f;
	}

}