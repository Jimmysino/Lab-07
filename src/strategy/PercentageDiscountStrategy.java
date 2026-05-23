package strategy;

public class PercentageDiscountStrategy implements DiscountStrategy {
    private double percentage;

    public PercentageDiscountStrategy(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(double total) {
        // Descuento porcentual sobre el total (ej. 10% -> 0.10)
        return total - (total * percentage);
    }
}