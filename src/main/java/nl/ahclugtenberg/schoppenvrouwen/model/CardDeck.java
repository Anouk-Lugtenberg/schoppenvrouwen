package nl.ahclugtenberg.schoppenvrouwen.model;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    private Integer id;
    private List<Card> cards = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
