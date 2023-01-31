package L04_E_Working_Abstraction.P01_CardSuites;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Card Suits:");
        Arrays.stream(CardSuites.values()).forEach(cardSuites -> System.out.printf("Ordinal value: %d; Name value: %s%n", cardSuites.ordinal(), cardSuites.name()));
    }
}
