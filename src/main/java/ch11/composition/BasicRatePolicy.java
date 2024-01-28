package ch11.composition;

public abstract class BasicRatePolicy implements RatePolicy{
    @Override
    public Money calculateFee(Phone phone) {
        Money result = Money.ZERO;
        phone.getCalls().forEach(call -> result.plus(calculateCallFee(call)));
        return result;
    }

    abstract protected Money calculateCallFee(Call call);
}
