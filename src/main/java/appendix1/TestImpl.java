package appendix1;

public class TestImpl implements TestInterface {
    @Override
    public Magazine test() {
        return new Magazine(new Publisher());
    }
}
