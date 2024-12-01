package abstractFactory;

public class Main {

    public static void main(String[] args) {
        // Creamos nuestros personajes y sus accesorios
        CharacterFactory warriorFactory = new WarriorFactory();
        Character warrior = warriorFactory.createCharacter("Aaron");
        System.out.println(warrior.action());

        CharacterFactory mageFactory = new MageFactory();
        Character mage = mageFactory.createCharacter("Diego");
        System.out.println(mage.action());

        CharacterFactory archerFactory = new ArcherFactory();
        Character archer = archerFactory.createCharacter("Roger");
        System.out.println(archer.action());
    }
}