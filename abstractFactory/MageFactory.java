package abstractFactory;

// Creador especifico para los personajes magos.
public class MageFactory implements CharacterFactory {
    //Asignamos equipamientos por defecto
    @Override
    public Character createCharacter(String name) {
        return new Mage(name, createWeapon(), createArmor());
    }

    @Override
    public Weapon createWeapon() {
        return new Staff();
    }

    @Override
    public Armor createArmor() {
        return new LightArmor();
    }
}
