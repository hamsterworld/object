package ch11.composition;

public class RateDiscountPolicy extends AdditionalRatePolicy{
    private Money discountAmount;

    public RateDiscountPolicy(RatePolicy next, Money discountAmount) {
        super(next);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return fee.minus(discountAmount);
    }
}
