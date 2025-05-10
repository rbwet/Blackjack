package HW2;

public class Card {

	private int rank; //num on card, 2-10 normally, 11 Jack, 12 Queen, 13 King, 14 Ace
	private char suit; //club, spade, heart, diamond
	
	public Card(int rank, char suit) {
		if(rank < 2 || rank > 14 || (suit != 'c' && suit != 's' && suit != 'h' && suit != 'd')) {
			throw new IllegalArgumentException("this card does not exist in a typical deck");
		}
		
		this.rank = rank;
		this.suit = suit;
	}
	
	
	public Card(Card card) {
		this.rank = card.rank;
		this.suit = card.suit;
	}
	
	public String toString() {
	    String cardRank;
	    
	    if(rank == 11) {
	        cardRank = "J";
	    } else if(rank == 12) {
	        cardRank = "Q";
	    } else if(rank == 13) {
	        cardRank = "K";
	    } else if (rank == 14) {
	        cardRank = "A";
	    } else {
	        cardRank = String.valueOf(rank);
	    }
	    return "Card: " + cardRank + suit;
	}

	public int getScore() {
	    if(rank > 10) {
	        return 10; // for jackk queen and King
	    } else if(rank == 14) {
	        return 11; // for Ace
	    } else {
	        return rank;
	    }
	}

	
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if(!(object instanceof Card)) {
			return false;
		}
		Card other = (Card) object; 
		return rank == other.rank && suit == other.suit;
	}
}
