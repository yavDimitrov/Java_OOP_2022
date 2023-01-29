
package L03_Working_Abstraction;

import java.util.Scanner;

public class P01_RhombusOfStars_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

       printRhombus(n);
    }

    public static void printRhombus(int size) {
        for (int i = 1; i <= size; i++) {
                printTriangle( size -i, i);
            }
            for (int i = 1; i < size; i++) {
                printTriangle( i, size-i);
            }
        }

    private static void printTriangle( int firstCount, int secondCount) {
        for (int i = 0; i < firstCount; i++) {
            System.out.print(" ");
        }
        for (int j = 0; j < secondCount; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }

}





