package appendix2.duck_test;

import ch14.Money;

public class SalariedEmployee {
    private String name;
    private Money basePay;

    public SalariedEmployee(String name, Money basePay) {
        this.name = name;
        this.basePay = basePay;
    }

    public Money calculatePay(double taxRate){
        return basePay.minus(basePay.times(taxRate));
    }
}
