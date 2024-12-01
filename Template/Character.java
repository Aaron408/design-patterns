package Template;

public abstract class Character {

    protected String name;
    protected int baseAttack;

    public Character(String name, int baseAttack) {
        this.name = name;
        this.baseAttack = baseAttack;
    }

    //Metodo para calcular el ataque modificado
    public final void calculateDamage() {
        int attack = getModifiedAttack();
        System.out.println(name + " realiza un daño de: " + attack);
    }

    // Obtener el ataque base
    public int getBaseAttack() {
        return this.baseAttack;
    }

    //Metodo para modificar el ataque segun los atributos del personaje
    protected abstract int getModifiedAttack();
}
