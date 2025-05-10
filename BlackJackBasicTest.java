package HW2;

public class BlackJackBasicTest {

    public static void main(String[] args) {
        
        //create a new deck and shuffle it
        Deck deck = new Deck();
        deck.shuffle();
        
        //rceate a player with a given stand value - 17 for testing
        Player player = new Player(17, true); //true for soft again
        
 
        player.play(deck);
        
        
        System.out.println(player.toString());

        //check if the player busted
        if (player.isBust()) {
            System.out.println("Player busted");
        } else {
            System.out.println("Player stamds");
        }
    }
}
