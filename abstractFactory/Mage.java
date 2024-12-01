package abstractFactory;

public class Mage extends Character {

    private Weapon weapon;
    private Armor armor;

    public Mage(String name, Weapon weapon, Armor armor) {
        super(name, 150, 80);
        this.weapon = weapon;
        this.armor = armor;
    }

    @Override
    public String action() {
        return name + " usa " + weapon.useWeapon() + " y ssu equipamiento es " + armor.useArmor();
    }
}
