package Builder;

public class Main {

    public static void main(String[] args) {
        // Creamos un personaje guerrero
        Character warrior = new Character.Builder("Thor", "Warrior")
                .health(100)
                .strength(80)
                .agility(50)
                .skills(new String[]{"Sword Slash", "Shield Block"})
                .build();

        // Crear un Mago
        Character mage = new Character.Builder("Gandalf", "Mage")
                .health(60)
                .strength(40)
                .agility(70)
                .skills(new String[]{"Fireball", "Teleport"})
                .build();

        // Imprimimos nuestros personajes
        System.out.println(warrior);
        System.out.println(mage);
    }
}
