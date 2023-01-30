package L04_E_Working_Abstraction.Demo_Hotel;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {


        Season summer = new Season("Summer", 24, "June", "July", "August");
        Season winter = new Season("Winter", 5, "December", "January", "February");
        Season spring = new Season("Spring", 12, "April", "May");
        Season autumn = new Season("Autum", 12, "September", "October");

       /* Season[] seasons = new Season[];

        seasons[0] = summer;
        seasons[1] = winter;
        seasons[2] = autumn;
        seasons[3] = spring;

        doSomething(seasons);*/
    }

    private static void doSomething(Season[] seasons) {


    }
}
