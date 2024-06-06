package ch14;


public abstract class BasicRatePolicy implements RatePolicy {
    @Override
    public Money calculateFee(Phone phone) {

        // 사전 조건
//        assert calls != null;
//        assert !calls.isEmpty();

        Money result = Money.ZERO;
        for (Call call : phone.getCalls()) {
            result.plus(calculateFee(phone));
        }

        // 사후 조건
        assert result.isGreaterThanOrEqual(Money.ZERO);

        return result;
    }

    protected abstract Money calculateCallFee(Call call);

}
