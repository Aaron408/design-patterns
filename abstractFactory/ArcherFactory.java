package abstractFactory;

// Creador especifico para los personajes arqueros.
public class ArcherFactory implements CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        return new Archer(name, createWeapon(), createArmor());
    }

    @Override
    public Weapon createWeapon() {
        return new Bow();
    }

    @Override
    public Armor createArmor() {
        return new LightArmor();
    }
}
