package Decorator;

public class Main {

    public static void main(String[] args) {
        // Creamos un personaje básico.
        Character basicCharacter = new BaseCharacter();

        System.out.println("Personaje inicial:");
        System.out.println("Descripción: " + basicCharacter.getDescription());
        System.out.println("Salud: " + basicCharacter.getHealth());
        System.out.println("Poder de ataque: " + basicCharacter.getAttackPower());

        //Agregamos armadura al personaje.
        Character armoredCharacter = new ArmorDecorator(basicCharacter);

        //Agregamos espada al personaje con armadura.
        Character armoredSwordCharacter = new SwordDecorator(armoredCharacter);

        //Le agregamos el ataque especial.
        Character fullyEquippedCharacter = new SpecialAttack(armoredSwordCharacter);

        System.out.println("\nPersonaje equipado:");
        System.out.println("Descripción: " + fullyEquippedCharacter.getDescription());
        System.out.println("Salud: " + fullyEquippedCharacter.getHealth());
        System.out.println("Poder de ataque: " + fullyEquippedCharacter.getAttackPower());
    }
}
