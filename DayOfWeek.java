package L03_Working_Abstraction;

public enum DayOfWeek {
    MONDAY (1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private int dayNumber;
    private String gliph;

    private DayOfWeek(int dayNumber){
        this.dayNumber = dayNumber;
    }

    public int getDayNumber(){
        return dayNumber;
    }
}
