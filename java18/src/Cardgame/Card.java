package Cardgame;

public class Card {
	public final int suitNumber;
	public final int rankNumber;

	public Card(int suitNumber, int rankNumber) {
		super();
		this.suitNumber = suitNumber;
		this.rankNumber = rankNumber;
	}

	public String getSuit() {
		switch (suitNumber) {
		case 1:
			return "♣";
		case 2:
			return "♦";
		case 3:
			return "♥";
		case 4:
			return "♠";

		default:
			return "";
		}
	}

	public String getRank() {
		switch (rankNumber) {
		case 1:
			return "Ace";
		case 2:
			return "2";
		case 3:
			return "3";
		case 10:
			return "10";
		case 11:
			return "Jack";
		case 12:
			return "Queen";
		case 13:
			return "King";

		default:
			return String.valueOf(rankNumber);
		}
	}

	public String toString() {
		return "Card \n[" + getSuit() + "] [" + getRank() + "]";
	}
	
}
