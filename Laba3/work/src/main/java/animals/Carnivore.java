package animals;

import enums.AnimalType;
import savanna.SavannaAnimal;

public class Carnivore extends SavannaAnimal {
    private int weightOfMeatPerDay;

    public Carnivore(final Integer id, final String name, final String family, final AnimalType type,
                     final int weight, final int lifetime,
                     final int weightOfMeatPerDay) {
        super(id, name, family, type, weight, lifetime);
        this.weightOfMeatPerDay = weightOfMeatPerDay;
    }

    @Override
    public final int getWeightOfFood() {
        return weightOfMeatPerDay;
    }

    public String getHeaders() {
        return super.getHeaders() + "weight of meat per day";
    }

    public String toCSV() {
        return super.toCSV() + "," + weightOfMeatPerDay;
    }
}
