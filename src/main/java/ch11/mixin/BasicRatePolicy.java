package ch11.mixin;


public abstract class BasicRatePolicy {

    public Money calculateFee(Phone phone) {
        return phone.getCalls().stream()
                .map(this::calculateCallFee)
                .reduce(Money.ZERO, Money::plus);
    }

    protected abstract Money calculateCallFee(Call call);

}
