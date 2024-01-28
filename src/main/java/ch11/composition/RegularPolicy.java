package ch11.composition;

import java.time.Duration;

public class RegularPolicy extends BasicRatePolicy{
    private Money amount;
    private Duration seconds;

    @Override
    protected Money calculateCallFee(Call call) {
        return amount.times(call.getDuration().getSeconds() / seconds.getSeconds());
    }
}
