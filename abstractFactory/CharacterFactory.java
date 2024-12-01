package abstractFactory;

public interface CharacterFactory {
    //Creamos nuestro personaje
    Character createCharacter(String name);
    //Creamos el arma para el personaje
    Weapon createWeapon();
    //Creamos su armadura.
    Armor createArmor();
}
