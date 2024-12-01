package factory;

// Clase especifica que extiende de la principal de personajes para devolver los valores que ocupa para crear uno.
public class Warrior extends Character {

    private int armor;

    public Warrior(String name) {
        super(name, 200, 50);
        this.armor = 30;
    }

    @Override
    public String action() {
        return name + " se tiene " + armor + " puntos de armadura.";
    }
}
