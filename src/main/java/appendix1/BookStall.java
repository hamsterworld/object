package appendix1;

// 자바는 마라미터의 반공변성을 허락하지않는다.
public class BookStall {
    public Book sell(IndependentPublisher independentPublisher){
        return new Book(independentPublisher);
    }
}
