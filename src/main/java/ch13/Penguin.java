package ch13;

public class Penguin implements Walker{

    private final Bird bird;

    public Penguin(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void walk() {

    }

}
