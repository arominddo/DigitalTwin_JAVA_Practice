package ch04;

class FlowEx24 {
	public static void main(String[] args) { 
		int i=11;

		System.out.println("자, 이제 카운트다운을 시작합니다.");

		while(i--!=0) {
			System.out.println(i);

			for(long j=0;j<4_000_000_000L ;j++) {
					;
			}
		}

		System.out.println("GAME OVER");
	}
}
