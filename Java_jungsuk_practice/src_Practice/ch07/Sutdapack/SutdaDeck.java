package ch07.Sutdapack;

public class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	int[] kwangs = {1,3,8};

	
	
	SutdaDeck() {
		for (int i=0; i < cards.length; i++) {
			cards[i] = new SutdaCard(i%10+1, false);
			
		}
//		cards[1-1].isKwang = true;
//		cards[3-1].isKwang = true;
//		cards[8-1].isKwang = true;
		
		for (int kwang: kwangs) {
			cards[kwang-1].isKwang = true;
		}
		
		public void shuffle() {
			for (int i; i < CARD_NUM; i++) {
				int index = (int)(Math.random() * CARD_NUM);
				SutdaCard tmp = cards[i];
				cards[i] = cards[index];
				cards[index] = tmp;
			}
		}
		
		public SutdaCard pick(int index) {
			return new SutadaCard();
		}
		
		public SutdaCard pick() {
			return new SutdaCard();
		}
		
//		for (SutdaCard card: cards) {
//		 	card = new Sutdacard();
//	 	}
		

	}
}
