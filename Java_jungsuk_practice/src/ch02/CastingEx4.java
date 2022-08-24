package ch02;

class CastingEx4 {
	public static void main(String[] args) {
		int   i  = 91234567;  // 8占쌘몌옙占쏙옙 10占쏙옙占쏙옙
		float f  = (float)i;  // int占쏙옙 float占쏙옙 占쏙옙占쏙옙환
		int   i2 = (int)f;	  // float占쏙옙 占쌕쏙옙 int占쏙옙 占쏙옙占쏙옙환

		double d = (double)i; // int占쏙옙 double占쏙옙 占쏙옙占쏙옙환
		int   i3 = (int)d;    // double占쏙옙 占쌕쏙옙 int占쏙옙 占쏙옙占쏙옙환

		float f2 = 1.666f;
		int   i4 = (int)f2;

		System.out.printf("i=%d\n", i);
		System.out.printf("f=%f i2=%d\n", f, i2);
		System.out.printf("d=%f i3=%d\n", d, i3);
		System.out.printf("(int)%f=%d\n", f2, i4);
	}
}
