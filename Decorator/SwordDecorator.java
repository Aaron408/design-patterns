package Decorator;

public class SwordDecorator extends CharacterDecorator {

    public SwordDecorator(Character decoratedCharacter) {
        super(decoratedCharacter);
    }

    @Override
    public String getDescription() {
        return decoratedCharacter.getDescription() + ", con espada";
    }

    //Suma de atributos a los base del personaje
    @Override
    public int getAttackPower() {
        return decoratedCharacter.getAttackPower() + 20;
    }
}
