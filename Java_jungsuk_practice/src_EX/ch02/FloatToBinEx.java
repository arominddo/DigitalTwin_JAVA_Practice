package ch02;

class FloatToBinEx {
	public static void main(String args[]) {
		float f = -9.1234567f;
		int i = Float.floatToIntBits(f);

		System.out.printf("%f%n", f);
		System.out.printf("%X%n", i); // 16占쏙옙占쏙옙占쏙옙 占쏙옙占?
	} // main占쏙옙 占쏙옙
}
