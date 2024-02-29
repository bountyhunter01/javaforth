package Cardgame;

public class CardMain {

	public static void main(String[] args) {
//		Card cardmain = new Card(2, 10);
//		Deck deck = new Deck();
//		deck.shuffle();
//		Deck hand = deck.deal(5);
		Deck deck = new Deck();

        // 52장의 표준 카드 덱을 생성합니다.
        for(int i=1; i<4; i++) {
            for(int j=1; j<=13; j++) {
                deck.addCard(new Card(i, j));
            }
        }

        // 카드 덱을 섞습니다.
        deck.shuffle();

        // 5장의 카드를 딜링합니다.
        Deck hand = deck.deal(4);

        // 딜링된 카드를 출력합니다.
        for(Card card : hand.getCards()) {
            System.out.println(card);
        }
	}

}
