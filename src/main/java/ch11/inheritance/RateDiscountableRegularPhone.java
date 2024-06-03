package ch11.inheritance;

import java.time.Duration;

public class RateDiscountableRegularPhone extends RegularPhone{

    private Money discountAmount;

    public RateDiscountableRegularPhone(Money amount, Duration seconds, Money discountAmount) {
        super(amount, seconds);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money afterCalculateFee(Money fee){
        return fee.minus(discountAmount);
    }

}
