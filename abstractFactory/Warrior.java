package abstractFactory;

public class Warrior extends Character {

    private Weapon weapon;
    private Armor armor;

    public Warrior(String name, Weapon weapon, Armor armor) {
        super(name, 200, 50);
        this.weapon = weapon;
        this.armor = armor;
    }

    @Override
    public String action() {
        return name + " usa " + weapon.useWeapon() + " y ssu equipamiento es " + armor.useArmor();
    }
}
