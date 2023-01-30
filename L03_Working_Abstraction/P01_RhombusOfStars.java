package L03_Working_Abstraction;

import java.util.Scanner;

public class P01_RhombusOfStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }

        for (int i = 1; i <= n - 1 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }


}
