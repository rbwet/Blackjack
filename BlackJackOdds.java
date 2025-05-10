/*
 * package HW2;
 * 
 * public class BlackJackOdds {
 * 
 * public static final int NUM_TRIALS = 5000;
 * 
 * public static void main(String[] args) {
 * 
 * // Range of stand values int[] standValues = {16, 17, 18}; Player dealer =
 * null; Player player = null;
 * 
 * for (int dealerStand : standValues) {
 * 
 * for (int playerStand : standValues) {

 */

package HW2;

public class BlackJackOdds {
    
    public static final int NUM_TRIALS = 5000;

    public static void main(String[] args) {

        int[] standValues = {16, 17, 18};
        Player dealer = null;
        Player player = null;

        for (int dealerStand : standValues) {

            for (int playerStand : standValues) {

                int dealerWins = 0;
                int playerWins = 0;
                int ties = 0;
                
                int dealerSoftCount = 0;
                int dealerHardCount = 0; 
                int playerSoftCount = 0; 
                int playerHardCount = 0; 

                for (int i = 0; i < NUM_TRIALS; i++) {
                    Deck deck = new Deck();
                    deck.shuffle();

                    dealer = new Player(dealerStand, false);  // or false, depending on the stand type 
                    player = new Player(playerStand, true);


                    player.play(deck);
                    dealer.play(deck);

                    int comparison = player.compareScores(dealer);
                    if (comparison > 0) {
                        playerWins++;
                    } else if (comparison < 0) {
                        dealerWins++;
                    } else {
                        ties++;
                    }
                    
                    //counters update based on hands
                    if (dealer.hand.isSoft()) dealerSoftCount++;
                    else dealerHardCount++;

                    if (player.hand.isSoft()) playerSoftCount++;
                    else playerHardCount++;

                }

                // Results
                String dealerType = (dealerSoftCount > dealerHardCount) ? "soft" : "hard";
                String playerType = (playerSoftCount > playerHardCount) ? "soft" : "hard";
                
                System.out.println("Dealer(" + dealerType + ") " + dealerStand + " vs Player(" + playerType + ") " + playerStand + ":");
                System.out.println("Dealer won: " + (100.0 * dealerWins / NUM_TRIALS) + "%");
                System.out.println("Player won: " + (100.0 * playerWins / NUM_TRIALS) + "%");
                System.out.println("Ties: " + (100.0 * ties / NUM_TRIALS) + "%");
                System.out.println();
            }
        }
    }
}

