package Decorator;

public class BaseCharacter implements Character {

    @Override
    public String getDescription() {
        return "Personaje base";
    }

    @Override
    public int getHealth() {
        return 100;
    }

    @Override
    public int getAttackPower() {
        return 10;
    }
}
