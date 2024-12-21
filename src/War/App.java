package War;

import java.util.Scanner;

public class App {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		
		System.out.println("Hello! Want to play a game? \n"
				+ "How about a game of War? \n"
				+ "Let's start! \n" +
				"Player One type you name, please: ");
		
		String nameOfP1 = scanner.nextLine();
		System.out.println("Player Two type you name, please: ");
		String nameOfP2 = scanner.nextLine();
		System.out.println("\n");
		
		
		
		Deck deck = new Deck();
		Player p1 = new Player (nameOfP1);
		Player p2 = new Player (nameOfP2);
		deck.shuffle();
	
		
		for(int i = 0; i < 26; i ++) {
			p1.getHand().add(deck.draw());
			p2.getHand().add(deck.draw());
		}
		
		
		
		for(int i = 0; i < 26; i ++) {
			Card p1Draw = p1.flip();
			System.out.print(nameOfP1 +" Flips: ");
			p1Draw.describe();
			System.out.print(nameOfP2 + " Flips: ");
			Card p2Draw = p2.flip();
			p2Draw.describe();
			if(p1Draw.getValue()> p2Draw.getValue()) {
				System.out.println(nameOfP1 +" WINS this round!");
				p1.incrementScore();
				System.out.println(nameOfP1 + " 's score is " + p1.getScore() + " | " + nameOfP2 + " 's score is " + p2.getScore());
				System.out.println("\n");
			} else if (p1Draw.getValue() < p2Draw.getValue()) {
				System.out.println(nameOfP2 + " WINS this round!");
				p2.incrementScore();
				System.out.println(nameOfP1 + " 's score is " + p1.getScore() + " | " + nameOfP2 + " 's score is " + p2.getScore());
				System.out.println("\n");

			} else {
				System.out.println(nameOfP1 + nameOfP2 + " 's values are the same, TIE no one wins this round.");
				System.out.println(nameOfP1 + " 's score is " + p1.getScore() + " | " + nameOfP2 + " 's score is " + p2.getScore());
				System.out.println("\n");
			}
			
			
			
		}//end of deal
		
		if(p1.getScore() > p2.getScore()) {
			System.out.println(nameOfP1 + " WINS this game! ");
		} else if (p1.getScore() < p2.getScore()) {
			System.out.println(nameOfP2 + " WINS this game!");
		} else {
			System.out.println(nameOfP1 + nameOfP2 + " score is the same, no one WINS, play again, it is a TIE for this game!");
		}
	} //end of main
	
	
}

