import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private Deck deck;

    public Game(){
        this.players = new ArrayList<>();
        this.deck = new Deck();
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }


    public int numberOfPlayers() {
        return this.players.size();
    }

    public void prepareDeck(){
        this.deck.populate();
        this.deck.shuffleDeck();
    }

    public void dealCard(){
        this.prepareDeck();
        for (Player player:players) {
            Card card = deck.dealCard();
            player.addCardToHand(card);
        }
    }

    public Player checkWinner() {
        Player winner = players.get(0);
        for (Player player:players) {
            if (winner.getHandValue() <= player.getHandValue())
            {winner = player;}
            else if (winner.getHandValue() == player.getHandValue())
            {winner = null;}
        }
        if (winner == null){
            System.out.println("Draw");
        }
        return winner;
    }
}
