//package ch07;
//
//class Outer {
//	class InstanceInner {     				// 인스턴스 내부 클래스
//		int iv=100;							// 인스턴스 내부 클래스의 인스턴스 변수
////		static int cv = 200;				// 인스턴스 내부 클래스의 클래스 변수( 이 조합은 사용 불가)
//	}
//	static class StaticInner {				// 스태틱 내부 클래스
//		int iv=200;							// 스태틱 내부 클래스의 인스턴스 변수
//		static int cv=300;					// 스태틱 내부 클래스의 클래스 변수
//	}
//
//	void myMethod() {						// 
//		class LocalInner {
//			int iv=400;
//		}
//	}
//}
//
//class InnerEx4 {
//	public static void main(String[] args) {
//		Outer o = new Outer();
//		Outer.StaticInner s = o.new StaticInner();
//		
//		
//		Outer.StaticInner si = new Outer.StaticInner();  // 22~23번 줄과 26번줄 둘 중 하나 선택하면 되는데 밑이 더 좋은 방법이다.
//		
//		// 인스턴스클래스의 인스턴스를 생성하려면
//		// 외부 클래스의 인스턴스를 먼저 생성해야 한다.
//		Outer oc = new Outer();
//		Outer.InstanceInner ii = oc.new InstanceInner();
//
//		System.out.println("ii.iv : "+ ii.iv);
//		System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner.cv);
//
//	     // 스태틱 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 된다.
//		Outer.StaticInner si = new Outer.StaticInner();
//		System.out.println("si.iv : "+ si.iv);
//	}
//}
