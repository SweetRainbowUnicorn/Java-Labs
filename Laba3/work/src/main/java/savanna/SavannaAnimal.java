package savanna;

import enums.AnimalType;

public class SavannaAnimal {
    private String name;
    private String family;
    private AnimalType type;
    private int weight;
    private int lifetime;
    private int weightOfFood;

    public int getFoodWeightPerDay() {
        return weightOfFood;
    }

    public SavannaAnimal(final String name, final String family,
                         final AnimalType type, final int weight,
                         final int lifetime) {
        this.name = name;
        this.family = family;
        this.type = type;
        this.weight = weight;
        this.lifetime = lifetime;
    }

    @Override
    public final String toString() {
        return "\n" + "SavannaAnimal{"
                + "name='" + name + '\''
                + ", family='" + family + '\''
                + ", type=" + type
                + ", weight=" + weight
                + ", lifetime=" + lifetime
                + "}\n";
    }

    public final String getName() {
        return name;
    }

    public final AnimalType getType() {
        return type;
    }


    public String getHeaders() {
        return "name, " + "family, " + "type, " + "weight, " + "lifetime, ";
    }

    public String toCSV() {
        return name + "," + family + "," + type + "," + weight + "," + lifetime;
    }
}
