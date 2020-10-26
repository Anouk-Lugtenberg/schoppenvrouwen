package nl.ahclugtenberg.schoppenvrouwen.model;

public class Card {
    public Suits suit;
    public Ranks rank;

    public Card(Suits suit, Ranks rank) {
        if (suit == Suits.SPADES && rank == Ranks.QUEEN) {
            this.rank = Ranks.QUEEN_OF_SPADES;
        } else {
            this.suit = suit;
            this.rank = rank;
        }
    }

    public Ranks getRank() {
        return rank;
    }

    public Suits getSuit() {
        return suit;
    }
}
