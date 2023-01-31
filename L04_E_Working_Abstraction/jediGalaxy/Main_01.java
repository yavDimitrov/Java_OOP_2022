package L04_E_Working_Abstraction.jediGalaxy;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Scanner;

public class Main_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimestions = readPosition(scanner.nextLine());

        int rows = dimestions[0];
        int cols = dimestions[1];

        StarField starsField = new StarField(rows, cols);
        Galaxy galaxy = new Galaxy(starsField);

      /*  int[][] galaxy = new int[rows][cols];

        fillInGalaxy(rows, cols, galaxy);*/

        String command = scanner.nextLine();

        long starsCollected = 0;

        while (!command.equals("Let the Force be with you")) {

            int[] jediPosition = readPosition(command);
            int[] evilPositions = readPosition(scanner.nextLine());

            int currentRowEvil = evilPositions[0];
            int currentColEvil = evilPositions[1];

            moveEvil(galaxy, currentRowEvil, currentColEvil);

            int currentRowJedi = jediPosition[0];
            int currentColJedi = jediPosition[1];

            starsCollected = moveJedi(galaxy, currentRowJedi, currentColJedi);

            command = scanner.nextLine();
        }

        System.out.println(starsCollected);


    }

    private static long moveJedi(int[][] galaxy, int currentRowJedi, int currentColJedi) {
        long starsCollected = 0;
        while (currentRowJedi >= 0 && currentColJedi < galaxy[1].length) {
            if (isInBounds(galaxy, currentRowJedi, currentColJedi)) {
                starsCollected += galaxy[currentRowJedi][currentColJedi];
            }

            currentColJedi++;
            currentRowJedi--;
        }
        return starsCollected;
    }

    private static void moveEvil(int[][] galaxy, int currentRowEvil, int currentColEvil) {
        while (currentRowEvil >= 0 && currentColEvil >= 0) {
            if (isInBounds(galaxy, currentRowEvil, currentColEvil)) {
                galaxy[currentRowEvil][currentColEvil] = 0;
            }
            currentRowEvil--;
            currentColEvil--;
        }
    }

    private static boolean isInBounds(int[][] galaxy, int row, int col) {
        return row >= 0 && col >= 0 && row < galaxy.length && col < galaxy.length;
    }

    private static int[] readPosition(String command) {
        return Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
    }

   }
