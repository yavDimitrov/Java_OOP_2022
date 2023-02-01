package L04_E_Working_Abstraction.P03_Cards;

public enum CardSuites {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);
    private int suitPower;
    CardSuites(int suitPower) {
        this.suitPower = suitPower;
    }

    public int getSuitPower() {
        return suitPower;
    }


}
