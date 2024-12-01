package Builder;

public class Character {

    private String name;
    private String characterClass;
    private int health;
    private int strength;
    private int agility;
    private String[] skills;

    //Constructor, solo es accedible desde el builder
    private Character(Builder builder) {
        this.name = builder.name;
        this.characterClass = builder.characterClass;
        this.health = builder.health;
        this.strength = builder.strength;
        this.agility = builder.agility;
        this.skills = builder.skills;
    }

    //Getters para los atributos de nuestro personaje
    public String getName() {
        return name;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public String[] getSkills() {
        return skills;
    }

    //Metodo para imprimr la info del usuario
    @Override
    public String toString() {
        return "Personaje{name='" + name + "', class='" + characterClass + "', health=" + health
                + ", strength=" + strength + ", agility=" + agility + ", skills=" + String.join(", ", skills) + "}";
    }

    //Builder para el objeto Character
    public static class Builder {

        private String name;
        private String characterClass;
        private int health;
        private int strength;
        private int agility;
        private String[] skills;

        //Constructor para obligar a tener ciertos atributos
        public Builder(String name, String characterClass) {
            this.name = name;
            this.characterClass = characterClass;
        }

        //Metodos para establecer atributos
        public Builder health(int health) {
            this.health = health;
            return this;
        }

        public Builder strength(int strength) {
            this.strength = strength;
            return this;
        }

        public Builder agility(int agility) {
            this.agility = agility;
            return this;
        }

        public Builder skills(String[] skills) {
            this.skills = skills;
            return this;
        }

        //Metodo para construir nuestro personaje final
        public Character build() {
            return new Character(this);
        }
    }
}
