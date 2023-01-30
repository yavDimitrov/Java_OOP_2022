package L04_E_Working_Abstraction.Demo_Hotel;

public class Season_02 {
    private String name;
    private String[] months;
    private double averageTemperature;

    public Season_02(String name, double averageTemperature, String... months) {
        this.name = name;
        this.months = months;
        this.averageTemperature = averageTemperature;
    }
}
