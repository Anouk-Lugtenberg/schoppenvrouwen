package nl.ahclugtenberg.schoppenvrouwen.model;

import nl.ahclugtenberg.schoppenvrouwen.service.CardDeckService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardDeckTest {

    @Test
    void cardDeckContains54Card() {
        CardDeckService cardDeckService = new CardDeckService();
        assertEquals(54, cardDeckService.createCardDeck52CardsAnd2Jokers().size());
    }
}
