package HW2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {


    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        char[] suits = {'h', 'd', 'c', 's'};
        for (int rank = 2; rank <= 14; rank++) {
            for (char suit : suits) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    
    public String toString() {
        StringBuilder deckString = new StringBuilder("Deck: [");
        for (int i = 0; i < cards.size(); i++) {
            deckString.append(cards.get(i).toString());
            if (i < cards.size() - 1) {
                deckString.append(", ");
            }
        }
        deckString.append("]");
        return deckString.toString();
    }


    public Card deal() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(0);
    }

    public void shuffle() {
        for (int i = 0; i < 100; i++) {
            int index1 = (int) (Math.random() * cards.size());
            int index2 = (int) (Math.random() * cards.size());
            Collections.swap(cards, index1, index2); //chatgpt was used as a resource for this method, as I was having difficulty figuring out how to shuffle
            //it showed me Collections which seems to do a great job of simplifying this process
        }
    }


    public void stack() {
        ArrayList<Card> aces = new ArrayList<>();
        ArrayList<Card> nonAces = new ArrayList<>();

        for (Card card : cards) {
            if (card.toString().contains("A")) {  //no getter in Card, so I just searched for what I am origninally returning
                aces.add(card);
            } else {
                nonAces.add(card);
            }
        }

        cards.clear();
        cards.addAll(aces);
        cards.addAll(nonAces);
    }




}
