package L04_E_Working_Abstraction.Demo_Hotel;

import java.util.ArrayList;
import java.util.List;

public class main_02 {
    public static void main(String[] args) {


        Season summer = new Season("Summer", 24, "June", "July", "August");
        Season winter = new Season("Winter", 5, "December", "January", "February");
        Season spring = new Season("Spring", 12, "April", "May");
        Season autumn = new Season("Autum", 12, "September", "October");

        List<Season> seasons = new ArrayList<>();

        seasons.add(summer);
        seasons.add(winter);
        seasons.add(autumn);
        seasons.add(spring);

        doSomething(seasons);
    }

    private static void doSomething(List<Season> seasons) {


    }
}
