package factory;

// Implementamos nuestra fabrica de personajes para crear uno según lo que elijamos.
public class CharacterFactory {

    public Character createCharacter(String type, String name) {
        //Se crea el personaje de la clase o type que se haya recibido.
        switch (type.toLowerCase()) {
            case "guerrero":
                return new Warrior(name);
            case "mago":
                return new Mage(name);
            case "arquero":
                return new Archer(name);
            default:
                throw new IllegalArgumentException("Tipo de personaje no válido: " + type);
        }
    }
}
