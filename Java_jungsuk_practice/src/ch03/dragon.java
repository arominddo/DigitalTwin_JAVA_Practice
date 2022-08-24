package ch03;

public class dragon {

	public static void main(String[] args) {
		int players = 13;
		
		String sports = players == 11 ? "축구" : "뭘까?";
		
		System.out.printf("선수의 수가 %d명인 종목은: %s\n\n", players, sports);
		
		sports = players == 11 ? whosFirst("축구") : whosFirst(players == 13 ? whosFirst("배구") : whosFirst("씨름"));
		System.out.printf("선수의 수가 %d명인 종목은: %s", players, sports);
		

	}
	
	static String whosFirst(String msg) {
		System.out.println(msg + "이 먼저 불립니다.");
		return msg;
		
	}

}
