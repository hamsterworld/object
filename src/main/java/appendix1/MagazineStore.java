package appendix1;

public class MagazineStore extends BookStall{

    @Override
    public Magazine sell(Publisher publisher) {
        return new Magazine(publisher);
    }

}
