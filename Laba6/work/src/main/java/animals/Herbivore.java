package animals;

import enums.AnimalType;
import savanna.SavannaAnimal;

public class Herbivore extends SavannaAnimal {
    private String plantsForFood;

    public Herbivore(final String name, final String family, final AnimalType type,
                     final int weight, final int lifetime, final String plantsForFood) {
        super(name, family, type, weight, lifetime);
        this.plantsForFood = plantsForFood;
    }

    public int getPlantsForFood() {
        return plantsForFood.length();
    }

    @Override
    public final int getFoodWeightPerDay() {
        return plantsForFood.length();
    }

}
