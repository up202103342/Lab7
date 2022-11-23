package pt.up.fe.ldts.example3;

public class FixedDiscount implements Discount{
    private double discount;
    public FixedDiscount(double discount) {
        this.discount = discount;
    }
    @Override
    public double applyDiscount(double price) {
        return price - discount;
    }

}
