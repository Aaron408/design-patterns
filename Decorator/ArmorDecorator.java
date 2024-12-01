package Decorator;

public class ArmorDecorator extends CharacterDecorator {

    public ArmorDecorator(Character decoratedCharacter) {
        super(decoratedCharacter);
    }

    @Override
    public String getDescription() {
        return decoratedCharacter.getDescription() + ", con armadura";
    }

    @Override
    public int getHealth() {
        return decoratedCharacter.getHealth() + 50;
    }
}
