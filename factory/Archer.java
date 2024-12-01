package factory;

// Clase especifica que extiende de la principal de personajes para devolver los valores que ocupa para crear uno.
public class Archer extends Character {

    private int arrows;

    public Archer(String name) {
        super(name, 160, 60);
        this.arrows = 50;
    }

    @Override
    public String action() {
        return name + " tiene " + arrows + " flechas.";
    }
}
