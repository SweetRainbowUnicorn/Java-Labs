package animals;

import enums.AnimalType;

public class TrueCarnivore extends Carnivore {

    public TrueCarnivore(final String name, final String family,
                         final AnimalType type,
                         final int weight, final int lifetime,
                         final String animalsForFood,
                         final int weightOfMeatPerDay) {
        super(name, family, type, weight, lifetime, weightOfMeatPerDay);
    }

}
