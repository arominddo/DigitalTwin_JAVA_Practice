//package ch07;
//
//class InnerEx6_1 {
//	Object iv = new Object(){ void method(){} };		// 익명클래스
//	static Object cv = new Object(){ void method(){} };	// 익명클래스
//
//	void myMethod() {
//		Object lv = new Object(){ void method(){} };	// 익명클래스
//	}
//	
//	public static void main(String[] args) {
//		NoName nn = new NoName(10);
//		nn.method();
//		NoName nn2 = new NoName(-5);
//		nn2.method();
//		
//		Object n = new Object() {
//			int x = 0;
//			
//			void method() {
//				System.out.println(x);
//			}
//		};
//	}
//
//	
//}
//
//
//class NoName {
//	NoName(int i) {
//		
//	}
//	
//	void method() {
//		
//	}
//	
//}
//
