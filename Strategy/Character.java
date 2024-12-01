package Strategy;

public class Character {

    private AttackStrategy attackStrategy; // Referencia a la estrategia de ataque

    // Constructor de personajes para asignar una estrategia de ataque inicial
    public Character(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    // Metodo para cambiar la estrategia de ataque.
    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    // Metodo para atacar con la estrategia usada
    public void performAttack() {
        attackStrategy.attack();
    }
}
