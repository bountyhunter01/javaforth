package Cardgame;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

	private ArrayList<Card> cards;

	public Deck() {
		cards = new ArrayList<Card>();
	}

	public void addCard(Card card3) {
		cards.add(card3);
	}

	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}

	public void shuffle() {
		Random random = new Random();

		for (int i = 0; i < cards.size(); i++) {
			int randIndex = random.nextInt(cards.size());
			Card temp = cards.get(i);
			cards.set(i, cards.get(randIndex));
			cards.set(randIndex, temp);
		}
	}

	public Deck deal(int count) {
		Deck hand = new Deck();
		for (int i = 0; i < count; i++) {
			hand.addCard(cards.remove(0));
//			if (i < count) {
//				System.out.println(count + "번 입니다");
//			} else {
//				System.out.println("그만 멈춰");
//				break;
//			}

		}
		return hand;
	}
}
