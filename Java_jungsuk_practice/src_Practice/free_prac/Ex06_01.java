package free_prac;

public class Ex06_01 {

	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());

	}

}

class SutdaCard {
	int num;
	boolean isKwang;

	public SutdaCard( ) {
		this(1,true);
	}
	
	SutdaCard(int num, boolean iskwang) {
		this.num = num;
		this.isKwang = iskwang;
	}
	
	String info() {
		return "" + this.num + (isKwang ? "K" : "");
		
	}
	
	
	
	
}