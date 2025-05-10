package HW2;
import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;
    private int score;
    private boolean soft;

    public Hand() {
        cards = new ArrayList<>();
        score = 0;
        soft = false;
    }

    public int getScore() {
        return score;
    }

    public boolean isSoft() {
        return soft;
    }
    
   

    private void updateScore(Card card) {
        int cardScore = card.getScore();
        
        if (cardScore == 11 && score + 11 <= 21) { 
            soft = true;
            score += 11;
        } else if (cardScore == 11) { 
            score += 1;
            //no change in soft status -> remain whatever it was
        } else {
            score += cardScore;
        }

        // if over 21 and soft, convert Ace from 11 to 1
        if (score > 21 && soft) {
            score -= 10; 
            soft = false; 
        }
    }

    	
    	
    	

        // Check if we're over 21 and if it's a soft hand, convert Ace from 11 to 1
//        if (score > 21 && soft) {
//            score -= 10; // Convert Ace from 11 to 1
//            soft = false;
//        }
    

    public void addCard(Card card) {
        cards.add(card);
        updateScore(card);
    }

    //  delete per assignment instructions
    /*
    public void removeCard(Card card) {
        cards.remove(card);
    }
    */

    
    public String toString() {
        StringBuilder handString = new StringBuilder("Hand (Score: " + score + (soft ? " Soft" : " Hard") + "): [");
        for (int i = 0; i < cards.size(); i++) {
            handString.append(cards.get(i).toString());
            if (i < cards.size() - 1) {
                handString.append(", ");
            }
        }
        handString.append("]");
        return handString.toString();
    }
}
