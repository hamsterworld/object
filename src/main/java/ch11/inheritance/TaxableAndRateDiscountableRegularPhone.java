package ch11.inheritance;

import java.time.Duration;

public class TaxableAndRateDiscountableRegularPhone extends RateDiscountableRegularPhone {

    private double taxRate;

    public TaxableAndRateDiscountableRegularPhone(Money amount, Duration seconds, Money discountAmount, double taxRate) {
        super(amount, seconds, discountAmount);
        this.taxRate = taxRate;
    }

    @Override
    protected Money afterCalculateFee(Money fee){
        return super.afterCalculateFee(fee).plus(fee.times(taxRate));
    }

}
