package appendix3.advanced;

public class Monster {
    private Breed breed;

    public Monster(Breed breed) {
        this.breed = breed;
    }

    public String getAttack(){
        return breed.getAttack();
    }
}
