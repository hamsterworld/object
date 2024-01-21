package ch10.inheritance;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class NightlyDiscountPhone extends Phone{

    private static final int LATE_NIGHT_HOUR = 22;
    private Money nightlyMoney;

    public NightlyDiscountPhone(Money nightlyMoney, Money regularMoney, Duration seconds, double taxRate) {
        super(regularMoney,seconds,taxRate);
        this.nightlyMoney = nightlyMoney;
    }

    @Override
    public Money calculateFee(){
        Money result = super.calculateFee();
        Money nightlyFee = Money.ZERO;
        for (Call call : getCalls()) {
            if(call.getFrom().getHour() >= LATE_NIGHT_HOUR){
                nightlyFee = result.plus(nightlyMoney.times(call.getDuration().getSeconds() / getSeconds().getSeconds()));
            }
        }
        return result.minus(nightlyFee.plus(nightlyFee.times(getTaxRate())));

    }

}
