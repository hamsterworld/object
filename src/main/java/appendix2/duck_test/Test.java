package appendix2.duck_test;

import ch14.Money;

public class Test {

    public static Money calculate(Employee employee,double taxRate){
        return employee.calculatePay(taxRate);
    }

    // duck typing이 불가능하다.
    public static void main(String[] args) {
//        calculate(new SalariedEmployee("햄스터",Money.ZERO),0.01);
//        calculate(new HourlyEmployee("햄스터",Money.ZERO,10),0.01);
    }
}
