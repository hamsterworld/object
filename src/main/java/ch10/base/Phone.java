package ch10.base;

import lombok.Getter;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@Getter
public class Phone {

    private Money amount;
    private Duration seconds;
    private List<Call> calls= new ArrayList<>();

    public Phone(Money amount, Duration seconds) {
        this.amount = amount;
        this.seconds = seconds;
    }

    public void call(Call call){
        calls.add(call);
    }

    public Money calculateFee(){
        Money result = Money.ZERO;
        calls.forEach(call -> {
            result.plus(amount.times(call.getDuration().getSeconds() / seconds.getSeconds()));
        });
        return result;
    }


}
