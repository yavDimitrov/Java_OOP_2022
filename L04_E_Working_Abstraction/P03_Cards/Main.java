package L04_E_Working_Abstraction.P03_Cards;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CardRangs cardRangs = CardRangs.valueOf(scan.nextLine());
        CardSuites cardSuites = CardSuites.valueOf(scan.nextLine());

        Card card = new Card(cardSuites, cardRangs);

        System.out.printf("Card name: %s of %s; Card power: %d",  card.getCardRangs(),card.getCardSuites(), card.getPower());
        //Card name: TWO of CLUBS; Card power: 2
    }
}
