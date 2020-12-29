package nl.ahclugtenberg.schoppenvrouwen.model;

import java.util.List;

public class CardPlayer {
    private User user;
    private List<Card> hand;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }
}
