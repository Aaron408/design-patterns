package factory;

// Clase especifica que extiende de la principal de personajes para devolver los valores que ocupa para crear uno.
public class Mage extends Character {

    private int mana;

    public Mage(String name) {
        super(name, 150, 80);
        this.mana = 100;
    }

    @Override
    public String action() {
        return name + " tiene " + mana + " puntos de maná.";
    }
}
