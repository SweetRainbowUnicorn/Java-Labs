package animals;

import enums.AnimalType;

public class TrueCarnivore extends Carnivore {

    public TrueCarnivore(final String name, final String family,
                         final AnimalType type,
                         final int weight, final int lifetime,
                         final int weightOfFood) {
        super(name, family, type, weight, lifetime, weightOfFood);
    }

    public String getHeaders() {
        return super.getHeaders();
    }

    public String toCSV() {
        return super.toCSV();
    }

}
