package Decorator;

public abstract class CharacterDecorator implements Character {

    protected Character decoratedCharacter;

    public CharacterDecorator(Character decoratedCharacter) {
        this.decoratedCharacter = decoratedCharacter;
    }

    @Override
    public String getDescription() {
        return decoratedCharacter.getDescription();
    }

    @Override
    public int getHealth() {
        return decoratedCharacter.getHealth();
    }

    @Override
    public int getAttackPower() {
        return decoratedCharacter.getAttackPower();
    }
}
