package ch10.advanced;

import ch10.base.Call;
import ch10.base.Money;
import lombok.Getter;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@Getter
public class Phone {

    private double taxRate;
    private Money amount;
    private Duration seconds;
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
