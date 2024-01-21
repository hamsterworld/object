package ch10.inheritance;

import lombok.Getter;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@Getter
public class Phone {

    private Money amount;
    private Duration seconds;
    private double taxRate;
    private List<Call> calls= new ArrayList<>();

    public Phone(Money amount, Duration seconds,double taxRate) {
        this.amount = amount;
        this.seconds = seconds;
        this.taxRate = taxRate;
    }

    public void call(Call call){
        calls.add(call);
    }

    public Money calculateFee(){
        Money result = Money.ZERO;
        calls.forEach(call -> {
            result.plus(amount.times(call.getDuration().getSeconds() / seconds.getSeconds()));
        });
        return result.plus(result.times(taxRate));
    }


}
