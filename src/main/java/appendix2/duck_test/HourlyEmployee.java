package appendix2.duck_test;

import ch14.Money;

public class HourlyEmployee {
    private String name;
    private Money basePay;
    private int timeCard;

    public HourlyEmployee(String name, Money basePay, int timeCard) {
        this.name = name;
        this.basePay = basePay;
        this.timeCard = timeCard;
    }

    public Money calculatePay(double taxRate){
        return basePay.times(timeCard).minus(basePay.times(timeCard).times(taxRate));
    }
}
