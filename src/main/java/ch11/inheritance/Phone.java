package ch11.inheritance;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public abstract class Phone {

    private List<Call> calls = new ArrayList<>();

    public Money calculateFee(){
        Money result = Money.ZERO;
        for (Call call : calls) {
            result = result.plus(calculateCallFee(call));
        }
        return afterCalculateFee(result);
    }

    abstract protected Money calculateCallFee(Call call);

    // 아래는 번거로워질것
    abstract protected Money afterCalculateFee(Money fee);

}
