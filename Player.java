package HW2;

public class Player {
    Hand hand;
    private int standValue;  
    private boolean softStand;

    public Player(int standValue, boolean softStand) {
        this.hand = new Hand();
        this.standValue = standValue;
        this.softStand = softStand;
    }

    public void play(Deck deck) {
        while (true) {
            if (hand.isSoft() && softStand && hand.getScore() >= standValue) {
                break;
            } else if (!hand.isSoft() && hand.getScore() >= standValue) {
                break;
            } 
            hand.addCard(deck.deal());
        }
    }


    public boolean isBust() {
        return hand.getScore() > 21;
    }

    public int compareScores(Player otherPlayer) {
        return Integer.compare(this.hand.getScore(), otherPlayer.hand.getScore());
    }

    public String toString() {
        return hand.toString();
    }
}
