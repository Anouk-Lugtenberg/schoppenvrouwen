package nl.ahclugtenberg.schoppenvrouwen.model;

public enum Ranks {
    TWO (5),
    THREE (5),
    FOUR (5),
    FIVE (5),
    SIX(5),
    SEVEN(5),
    EIGHT(5),
    NINE(5),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10),
    ACE(20),
    JOKER(20),
    QUEEN_OF_SPADES(100);

    private final int value;
    Ranks(int value) {
        this.value = value;
    }

    int getValue() {
        return this.value;
    }
}
