package ch10.base;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class NightlyDiscountPhone {

    private static final int LATE_NIGHT_HOUR = 22;

    private Money nightlyMoney;
    private Money regularMoney;
    private Duration seconds;
    private List<Call> calls = new ArrayList<>();

    public NightlyDiscountPhone(Money nightlyMoney, Money regularMoney, Duration seconds) {
        this.nightlyMoney = nightlyMoney;
        this.regularMoney = regularMoney;
        this.seconds = seconds;
    }

    public Money calculateFee(){
        Money result = Money.ZERO;

        for (Call call : calls) {
            if(call.getFrom().getHour() >= LATE_NIGHT_HOUR){
                result = result.plus(nightlyMoney.times(call.getDuration().getSeconds() / seconds.getSeconds()));
            } else {
                result = result.plus(regularMoney.times(call.getDuration().getSeconds() / seconds.getSeconds()));
            }
        }

        return result;
    }

}
