package ch14;


public interface RatePolicy {
    Money calculateFee(Phone phone);
}
