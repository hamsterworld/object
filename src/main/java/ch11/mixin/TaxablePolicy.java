package ch11.mixin;

public class TaxablePolicy extends BasicRatePolicy{

    private double taxRate;

    public TaxablePolicy(double taxRate) {
        this.taxRate = taxRate;
    }

    @Override
    public Money calculateFee(Phone phone) {
        Money fee = super.calculateFee(phone);
        return fee.plus(fee.times(taxRate));
    }
}
