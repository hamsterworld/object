package appendix1;

import lombok.ToString;

import java.util.function.Function;

@ToString
public class Customer {

    private Book book;

    public void order(Function<IndependentPublisher,Book> order) {
        this.book = order.apply(new IndependentPublisher());
    }

}
