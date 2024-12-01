package Template;

public class Mage extends Character {

    private int intelligence;

    public Mage(String name, int baseAttack, int intelligence) {
        super(name, baseAttack);
        this.intelligence = intelligence;
    }

    //Calculo de su daño debido a su inteligencia
    @Override
    protected int getModifiedAttack() {
        return getBaseAttack() + (intelligence * 2);
    }
}
