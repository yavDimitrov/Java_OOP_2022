package L04_E_Working_Abstraction.P02_CardRangs;

public class Main {
    public static void main(String[] args) {


        System.out.println("Card Ranks:");
        for (CardRangs cardRank: CardRangs.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", cardRank.ordinal(), cardRank.name());
        }
    }
}
