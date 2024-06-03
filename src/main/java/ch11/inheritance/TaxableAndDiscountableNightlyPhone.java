package ch11.inheritance;

import java.time.Duration;

public class TaxableAndDiscountableNightlyPhone extends TaxableRegularPhone{
    private Money discountAmount;

    public TaxableAndDiscountableNightlyPhone(Money amount, Duration seconds, double taxRate, Money discountAmount) {
        super(amount, seconds, taxRate);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money afterCalculateFee(Money fee){
        return super.afterCalculateFee(fee).minus(discountAmount);
    }

}
