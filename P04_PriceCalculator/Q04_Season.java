package L03_Working_Abstraction.P04_PriceCalculator;

public enum Q04_Season {

    /*  1 during Autumn
2 during Spring
3 during Winter
4 during Summer */

    AUTUMN(1),
    SPRING(2),
    WINTER(3),
    SUMMER(4);

    private int multiplier;

    Q04_Season(int multiplier) {
        this.multiplier = multiplier;
    }

    public int getMultiplier() {
        return this.multiplier;
    }

    public static Q04_Season parse(String str) {
        return Q04_Season.valueOf(str.toUpperCase());
    }

}
