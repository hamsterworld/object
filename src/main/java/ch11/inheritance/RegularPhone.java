package ch11.inheritance;


import java.time.Duration;


public class RegularPhone extends Phone{

    private Money amount;
    private Duration seconds;

    public RegularPhone(Money amount, Duration seconds) {
        this.amount = amount;
        this.seconds = seconds;
    }

    @Override
    protected Money calculateCallFee(Call call) {
        return amount.times(call.getDuration().getSeconds()/seconds.getSeconds());
    }

    @Override
    protected Money afterCalculateFee(Money fee) {
        return fee;
    }
}
