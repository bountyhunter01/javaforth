package Cardgame;

public class BlackjackCard extends Card {

	public BlackjackCard(int suitNumber, int rankNumber) {
		super(suitNumber, rankNumber);
	}

	public int getValue(int value) {
		if (getRank().equals("Ace")) {
			return value = 11;
		} else if (getRank().equals("Jack") || getRank().equals("Queen") || getRank().equals("King")) {
			return 10;
		} else {
			return Integer.parseInt(getRank());
		}
	}

	public boolean isAce() {
		return getRank().equals("Ace");
	}

	public static void main(String[] args) {
		Deck deck = new Deck();

		// 52장의 표준 카드 덱을 생성합니다.
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j <= 13; j++) {
				deck.addCard(new BlackjackCard(i, j));//이거를 안바꾸니까 안나오지 멍청아
			}
		}

		// 카드 덱을 섞습니다.
		deck.shuffle();

		// 5장의 카드를 딜링합니다.
		Deck hand = deck.deal(5);

		// 딜링된 카드를 출력합니다.
		for (Card card : hand.getCards()) {
			if (card instanceof BlackjackCard) {
				BlackjackCard blackjackCard = (BlackjackCard) card;
				 
				System.out.println(blackjackCard+" "+blackjackCard.getValue(1));
			}
		}
	}

}
