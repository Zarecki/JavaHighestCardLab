import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Deck deck;
    Player player;

    @Before
    public void before(){
        this.game = new Game();
        this.deck = new Deck();
        this.player = new Player();
    }

    @Test
    public void canAddPlayer(){
        assertEquals(0, game.numberOfPlayers());
        game.addPlayer(player);
        assertEquals(1, game.numberOfPlayers());
    }

    @Test
    public void playerHandHasCard(){
        game.addPlayer(player);
        game.dealCard();
        assertEquals(1, player.checkCardsInHand());
    }

    @Test
    public void checkForWinner(){
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Card highCard = new Card(SuitType.HEARTS, RankType.KING);
        Card midCard = new Card(SuitType.HEARTS, RankType.NINE);
        Card lowCard = new Card(SuitType.HEARTS, RankType.TWO);
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addPlayer(player3);
        player1.addCardToHand(highCard);
        player2.addCardToHand(midCard);
        player3.addCardToHand(lowCard);
        assertEquals(player1, game.checkWinner());
    }
}
