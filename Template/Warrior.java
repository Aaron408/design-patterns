package Template;

public class Warrior extends Character {

    private int strength;

    public Warrior(String name, int baseAttack, int strength) {
        super(name, baseAttack);
        this.strength = strength;
    }

    //Calculo de su daño por su ataque
    @Override
    protected int getModifiedAttack() {
        return getBaseAttack() + strength;
    }
}
