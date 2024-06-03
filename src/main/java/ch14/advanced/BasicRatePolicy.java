package ch14.advanced;


import ch14.Call;
import ch14.Money;
import ch14.Phone;
import ch14.RatePolicy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class BasicRatePolicy implements RatePolicy {

    private List<FeeRule> feeRules = new ArrayList<>();

    public BasicRatePolicy(FeeRule... feeRules) {
        this.feeRules = Arrays.asList(feeRules);
    }

    @Override
    public Money calculateFee(Phone phone) {
        return phone.getCalls().stream().map(call -> calculate(call)).reduce(Money.ZERO,(first,second) -> first.plus(second));
    }

    private Money calculate(Call call){
        return feeRules.stream().map(rule -> rule.calculateFee(call)).reduce(Money.ZERO,(first,second) -> first.plus(second));
    }
}
