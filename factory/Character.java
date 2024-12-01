package factory;

// Clase base para los personajes que se crean.
public abstract class Character {
    protected String name;
    protected int health;
    protected int strength;

    public Character(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }
    
    public abstract String action();
}
