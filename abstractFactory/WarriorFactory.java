package abstractFactory;

// Creador especifico para los personajes guerreros.
public class WarriorFactory implements CharacterFactory {
    //Asignamos equipamientos por defecto
    @Override
    public Character createCharacter(String name) {
        return new Warrior(name, createWeapon(), createArmor());
    }

    @Override
    public Weapon createWeapon() {
        return new Sword();
    }

    @Override
    public Armor createArmor() {
        return new HeavyArmor();
    }

}
