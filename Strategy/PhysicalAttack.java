package Strategy;

public class PhysicalAttack implements AttackStrategy {

    @Override
    public void attack() {
        System.out.println("Realizando un ataque físico!");
    }
}
