package nl.ahclugtenberg.schoppenvrouwen.service;

import nl.ahclugtenberg.schoppenvrouwen.model.Card;
import nl.ahclugtenberg.schoppenvrouwen.model.Ranks;
import nl.ahclugtenberg.schoppenvrouwen.model.Suits;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    private List<Card> cardDeck = new ArrayList<>();

    /**
     * Creates a Card Deck which contains standard 52 cards and 2 joker cards.
     */
    public void createCardDeck() {
        for (Suits suit : Suits.values()) {
            for (Ranks rank : Ranks.values()) {
                // Do not add jokers to deck
                if (rank != Ranks.JOKER && rank != Ranks.QUEEN_OF_SPADES) {
                    cardDeck.add(new Card(suit, rank));
                }
            }
        }
        // Add 2 jokers to card deck - suit does not matter.
        cardDeck.add(new Card(Suits.HEARTS, Ranks.JOKER));
        cardDeck.add(new Card(Suits.HEARTS, Ranks.JOKER));
    }

    public List<Card> getCardDeck() {
        return cardDeck;
    }
}
