package nl.ahclugtenberg.schoppenvrouwen.model;

import nl.ahclugtenberg.schoppenvrouwen.service.CardDeck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardDeckTest {

    @Test
    void cardDeckContains54Card() {
        CardDeck cardDeck = new CardDeck();
        cardDeck.createCardDeck();
        assertEquals(54, cardDeck.getCardDeck().size());
    }
}
