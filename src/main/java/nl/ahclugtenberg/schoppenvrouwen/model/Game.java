package nl.ahclugtenberg.schoppenvrouwen.model;

import java.util.List;

public class Game {
    private Integer id;
    private List<CardPlayer> playersOfGame;
    private CardDeck cardDeck;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<CardPlayer> getPlayersOfGame() {
        return playersOfGame;
    }

    public void addUserToGame(CardPlayer player) {
        if (this.playersOfGame.size() < 4) {
            this.playersOfGame.add(player);
        }
    }

    public CardDeck getCardDeck() {
        return cardDeck;
    }

    public void setCardDeck(CardDeck cardDeck) {
        this.cardDeck = cardDeck;
    }
}
