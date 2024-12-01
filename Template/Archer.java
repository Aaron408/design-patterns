package Template;

public class Archer extends Character {

    private int dexterity;

    public Archer(String name, int baseAttack, int dexterity) {
        super(name, baseAttack);
        this.dexterity = dexterity;
    }

    //Calculo de su daño dependiendo de su destreza
    @Override
    protected int getModifiedAttack() {
        return getBaseAttack() + (dexterity / 2);
    }
}
