package nl.ahclugtenberg.schoppenvrouwen.service;

import nl.ahclugtenberg.schoppenvrouwen.model.Card;
import nl.ahclugtenberg.schoppenvrouwen.model.CardDeck;
import nl.ahclugtenberg.schoppenvrouwen.model.Ranks;
import nl.ahclugtenberg.schoppenvrouwen.model.Suits;

import java.util.ArrayList;
import java.util.List;

public class CardDeckService {
    /**
     * Creates a Card Deck which contains standard 52 cards and 2 joker cards.
     */
    public CardDeck createCardDeck52CardsAnd2Jokers() {
        CardDeck cardDeck = new CardDeck();
        List<Card> cards = new ArrayList<>();
        for (Suits suit : Suits.values()) {
            for (Ranks rank : Ranks.values()) {
                // Do not add jokers to deck
                if (rank != Ranks.JOKER && rank != Ranks.QUEEN_OF_SPADES) {
                    cards.add(new Card(suit, rank));
                }
            }
        }
        // Add 2 jokers to card deck - suit does not matter.
        cards.add(new Card(Suits.HEARTS, Ranks.JOKER));
        cards.add(new Card(Suits.HEARTS, Ranks.JOKER));

        cardDeck.setCards(cards);
        return cardDeck;
    }
}
