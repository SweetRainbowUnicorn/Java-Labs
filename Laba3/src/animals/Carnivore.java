package animals;

import enums.AnimalType;
import savanna.SavannaAnimal;

public class Carnivore extends SavannaAnimal {
    private int weightOfMeatPerDay;

    Carnivore(final String name, final String family, final AnimalType type,
              final int weight, final int lifetime,
              final int weightOfMeatPerDay) {
        super(name, family, type, weight, lifetime);
        this.weightOfMeatPerDay = weightOfMeatPerDay;
    }

    @Override
    public final int getFoodWeightPerDay() {
        return weightOfMeatPerDay;
    }

}
