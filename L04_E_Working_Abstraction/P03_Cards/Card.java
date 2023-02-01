package L04_E_Working_Abstraction.P03_Cards;

public class Card {
    private CardSuites cardSuites;
    private CardRangs cardRangs;

    public Card(CardSuites cardSuites, CardRangs cardRangs) {
        this.cardSuites = cardSuites;
        this.cardRangs = cardRangs;
    }

    public CardSuites getCardSuites() {
        return cardSuites;
    }

    public void setCardSuites(CardSuites cardSuites) {
        this.cardSuites = cardSuites;
    }

    public CardRangs getCardRangs() {
        return cardRangs;
    }

    public void setCardRangs(CardRangs cardRangs) {
        this.cardRangs = cardRangs;
    }

    public int getPower(){
        return cardRangs.getRankPoweer()+cardSuites.getSuitPower();
    }
}
