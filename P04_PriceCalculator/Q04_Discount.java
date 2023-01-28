package L03_Working_Abstraction.P04_PriceCalculator;

public enum Q04_Discount {
    VIP(0.80),
    SECOND_VISIT(0.9),
    NONE(1);

    /*
    20% for VIP clients - VIP
    10% for clients, visiting for a second time - SecondVisit
    0% if there is no discount - None
    */

    private double priceReductionFactor;
    Q04_Discount(double priceReductionFactor) {
        this.priceReductionFactor = priceReductionFactor;
    }

    public double getPriceReductionFactor() {
        return this.priceReductionFactor;
    }

    public static Q04_Discount parse(String str) {
        switch (str) {
            case "VIP":
                return VIP;
            case "SecondVisit":
                return SECOND_VISIT;
            case "None":
                return NONE;
            default:
                throw new IllegalArgumentException("Unknown enum value " + str);
        }
    }
}
