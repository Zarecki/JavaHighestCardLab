import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;

public class Deck {

    private ArrayList<Card> deck;

    public Deck(){
        this.deck = new ArrayList<>();
    }

    public int countCards() {
        return deck.size();
    }

    public void populate(){
       ArrayList<Card> deckOfCards = this.generateCards();
        for (Card card : deckOfCards) {
            this.deck.add(card);
        }
    }

    public ArrayList<Card> generateCards() {
        ArrayList<Card> preparedCards = new ArrayList<>();
        SuitType[] suits = SuitType.values();
        RankType[] ranks = RankType.values();
        for (SuitType suit: suits) {
            for (RankType rank: ranks) {
                Card card = new Card(suit, rank);
                preparedCards.add(card);
            }
        }
        return preparedCards;
    }

    public boolean hasShuffleWorked(){
        Card card1 = this.deck.get(0);
        Collections.shuffle(this.deck);
        Card card2 = this.deck.get(0);
        return card1 == card2;
    }

    public Card dealCard(){
        Card dealtCard = this.deck.remove(0);
        return dealtCard;
    }

    public void shuffleDeck(){
        Collections.shuffle(this.deck);
    }
}
