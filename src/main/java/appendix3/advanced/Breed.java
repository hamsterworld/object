package appendix3.advanced;

public class Breed {
    private String name;
    private int health;
    private String attack;

    public Breed(String name, int health, String attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String getAttack() {
        return attack;
    }
}
