package L04_E_Working_Abstraction.jediGalaxy;


import java.util.Arrays;
import java.util.Scanner;

    public class Main {
        public static  int[][] galaxy = null;
        public static  int[] peterCoordinates = new int[2];
        public static  int[] evilCoordinates = new int[2];
        public static long sum = 0;

        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);

            int[] dimensions = Arrays.stream(console.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

            galaxy = fillMatrix(dimensions);

            String command;


            while (!"Let the Force be with you".equals(command = console.nextLine())) {

                peterCoordinates = Arrays.stream(command.split("\\s+")).mapToInt(Integer::parseInt).toArray();
                evilCoordinates = Arrays.stream(console.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

                removeStarsFromEvil();

                sum = getSumFromStars();
            }

            System.out.println(sum);
        }

        private static long getSumFromStars() {
            int peterRow = peterCoordinates[0];
            int peterCol = peterCoordinates[1];

            while (peterRow >= 0 && peterCol < galaxy[0].length) {
                if (peterRow < galaxy.length && peterCol >=0) {
                    sum += galaxy[peterRow][peterCol];
                }

                peterCol++;
                peterRow--;
            }

            return sum;
        }

        private static void removeStarsFromEvil() {
            int evilRow = evilCoordinates[0];
            int evilCol = evilCoordinates[1];

            while (evilRow >= 0 && evilCol >= 0) {
                if (evilRow < galaxy.length && evilCol < galaxy[0].length) {
                    galaxy[evilRow][evilCol] = 0;
                }
                evilRow--;
                evilCol--;
            }
        }

        private static int[][] fillMatrix(int[] dimensions) {
            galaxy = new int[dimensions[0]][dimensions[1]];
            int value = 0;

            for (int i = 0; i < galaxy.length; i++) {
                for (int j = 0; j < galaxy[i].length; j++) {
                    galaxy[i][j] = value++;
                }
            }

            return galaxy;
        }
    }

