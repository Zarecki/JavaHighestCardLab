import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;
    private int handValue;

    public Player(){
        this.hand = new ArrayList<>();
        this.handValue = 0;
    }

    public void addCardToHand(Card card){
        this.hand.add(card);
        this.handValue = card.getValueFromEnum();
    }

    public int checkCardsInHand(){
        return this.hand.size();
    }

    public int getHandValue(){
        return handValue;
    }
}
