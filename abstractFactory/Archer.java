package abstractFactory;

public class Archer extends Character {

    private Weapon weapon;
    private Armor armor;

    public Archer(String name, Weapon weapon, Armor armor) {
        super(name, 160, 60);
        this.weapon = weapon;
        this.armor = armor;
    }

    @Override
    public String action() {
        return name + " usa " + weapon.useWeapon() + " y su equipamiento es " + armor.useArmor();
    }
}
