package L03_Working_Abstraction.P04_PriceCalculator;

public class P04_priceCalculator {
    private double pricePerDay;
    private int days;
    private Q04_Season season;
    private Q04_Discount discount;

    public P04_priceCalculator(double pricePerDay, int days, Q04_Season season, Q04_Discount discount) {
        this.pricePerDay = pricePerDay;
        this.days = days;
        this.season = season;
        this.discount = discount;
    }

    public double calculatePrice() {
        return pricePerDay*days*season.getMultiplier()* discount.getPriceReductionFactor();
    }
}
