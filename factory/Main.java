package factory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        Scanner scanner = new Scanner(System.in);
        
        //Pedimos el tipo o clase del personaje que queremos crear.
        System.out.println("Ingresa el tipo de personaje (Guerrero, Mago, Arquero):");
        String type = scanner.nextLine();
        
        //Le asignamos un nombre que irá como parametro (1 de los 3 que ocupa un personaje).
        System.out.println("Ingresa el nombre del personaje:");
        String name = scanner.nextLine();

        try {
            // Manejamos la creación de nuestro personaje mandando el tipo/clase que queremos crear.
            Character character = factory.createCharacter(type, name);
            System.out.println("Personaje creado: " + character.getName());
            System.out.println("Acción: " + character.action());
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
