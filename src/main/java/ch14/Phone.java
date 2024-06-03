package ch14;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
public class Phone {

    private RatePolicy ratePolicy;
    private List<Call> calls = new ArrayList<>();

    public Phone(RatePolicy ratePolicy){
        this.ratePolicy = ratePolicy;
    }

    public Money calculateFee(){
        return ratePolicy.calculateFee(this);
    }


    public void call(Call call) {

    }
}
