package Template;

public class Main {

    public static void main(String[] args) {
        //Creamos personajes con diferentes atributos
        Character warrior = new Warrior("Guerrero", 50, 30);
        Character mage = new Mage("Mago", 40, 25);
        Character archer = new Archer("Arquero", 45, 20);

        //Calculamos el daño para cada uno y lo imprimimos
        warrior.calculateDamage();
        mage.calculateDamage();
        archer.calculateDamage();
    }
}
