package L03_Working_Abstraction.P02_PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] coordinates = getCoordinates(scan);

        Point A = new Point(coordinates[0],coordinates[1]);
        Point C = new Point(coordinates[2],coordinates[3]);


        Rectangle rect = new Rectangle(A, C);

        int n = Integer.parseInt(scan.nextLine());

        while(n --> 0){
            int[] pointCoordinates = getCoordinates(scan);

            Point x = new Point(pointCoordinates[0], pointCoordinates[1] );
            /*Pa(x1,y1) ,  Pc(x2, y2) , Px (x3, y3)
            For Px to be inseide the following should be true
            x3 >= x1 && y3 >= y1 && x3 <= x2 && y3 <= y2
            */


            boolean isInside = rect.contains(x);

            System.out.println(isInside);
        }
    }

    private static int[] getCoordinates(Scanner scan) {
        return Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
