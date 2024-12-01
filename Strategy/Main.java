package Strategy;

public class Main {

    public static void main(String[] args) {
        // Creamos un personaje y le asignamos una estrategia de ataque inicial
        Character warrior = new Character(new PhysicalAttack());

        // El guerrero realiza el ataque físico
        warrior.performAttack();

        // Cambiamos la estrategia de ataque porque se le rompió el arma
        warrior.setAttackStrategy(new MagicalAttack());

        // Atacamos
        warrior.performAttack();
    }
}
