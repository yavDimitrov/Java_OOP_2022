
package L03_Working_Abstraction;

import java.util.Scanner;

public class P01_RhombusOfStars_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

       printRhombus(n);
    }

    public static void printRhombus(int size) {
        for (int i = 1; i <= size; i++) {
            printUpperPart(size, i);
            }
            for (int i = 1; i < size; i++) {
                printBottomPart(size, i);
            }

        }

    private static void printBottomPart(int size, int i) {
        for (int j = 0; j < i; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < size -i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    private static void printUpperPart(int size, int i) {
        for (int j = 0; j < size -i; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }

}





