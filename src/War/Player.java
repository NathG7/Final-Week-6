package War;

import java.util.ArrayList;
import java.util.List;

public class Player {
	List<Card> hand = new ArrayList<Card>();
	String name;
	int score = 0;
	
	public Player(String name) {
		this.name = name;
	}

	public void describePlayer(Player player) {
		for (Card c: hand) {
			c.describe();
		}
		
		
	}
	
	public Card draw(Deck deck) {
		Card card = deck.draw();
		return card;
	}
	
	public Card flip() {
		Card card = hand.remove(0);
		return card;
	}
	
	public void incrementScore() {
		this.score++;
		}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}
	
	
	
	
	
	
	

	