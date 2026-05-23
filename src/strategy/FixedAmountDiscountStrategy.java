package strategy;
public class FixedAmountDiscountStrategy implements DiscountStrategy {
    private double fixedDiscount;
    public FixedAmountDiscountStrategy(double fixedDiscount) {
        this.fixedDiscount = fixedDiscount;
    }
    @Override
    public double applyDiscount(double total) {
        double newTotal = total - fixedDiscount;
        if (newTotal > 0) {
            return newTotal;
        } else {
            return 0;
        }
    }
}