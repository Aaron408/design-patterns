package Decorator;

public class SpecialAttack extends CharacterDecorator {

    public SpecialAttack(Character decoratedCharacter) {
        super(decoratedCharacter);
    }

    @Override
    public String getDescription() {
        return decoratedCharacter.getDescription() + ", con habilidad especial";
    }

    //Suma de atributos base
    @Override
    public int getAttackPower() {
        return decoratedCharacter.getAttackPower() + 15;
    }

    @Override
    public int getHealth() {
        return decoratedCharacter.getHealth() + 30;
    }
}
