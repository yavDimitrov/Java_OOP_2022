package L03_Working_Abstraction.P04_PriceCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] tokens = scan.nextLine().split("\\s+");

        double pricePerDay = Double.parseDouble(tokens[0]);
        int days = Integer.parseInt(tokens[1]);
        Q04_Season season = Q04_Season.parse(tokens[2]);
        Q04_Discount discount = Q04_Discount.parse(tokens[3]);

        P04_priceCalculator calculator = new P04_priceCalculator(pricePerDay, days, season, discount);

        System.out.printf("%.2f%n", calculator.calculatePrice());

    }
}
