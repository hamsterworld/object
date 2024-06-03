package ch11.composition;


public abstract class BasicRatePolicy implements RatePolicy{
    @Override
    public Money calculateFee(Phone phone) {
        Money result = Money.ZERO;
        for (Call call : phone.getCalls()) {
            result.plus(calculateFee(phone));
        }

        return result;
    }

    protected abstract Money calculateCallFee(Call call);

}
