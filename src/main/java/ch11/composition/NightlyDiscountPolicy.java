package ch11.composition;

import java.time.Duration;

public class NightlyDiscountPolicy extends BasicRatePolicy{

    private static final int LATE_NIGHT_HOUR = 22;

    private Money nightlyAmount;
    private Money regularAmount;
    private Duration seconds;
    @Override
    protected Money calculateCallFee(Call call) {
        return null;
    }

}
