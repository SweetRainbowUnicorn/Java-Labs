package animals;

import enums.AnimalType;

public class Vulture extends Carnivore {

    public Vulture(final String name, final String family,
                   final AnimalType type,
                   final int weight, final int lifetime,
                   final int weightOfMeatPerDay) {
        super(name, family, type, weight, lifetime, weightOfMeatPerDay);
    }


}
