package appendix3.advanced;

public class Test {
    public static void main(String[] args) {
        Monster dragon = new Monster(new Breed("용", 230, "용은 불을 내뿜는다."));
        Monster troll = new Monster(new Breed("트롤", 48, "트롤은 곤봉으로 때린다."));
    }
}
