package animals;

import enums.AnimalType;
import enums.TimeOfActivity;

public class TrueCarnivore extends Carnivore {
    private String animalsForFood;

    public TrueCarnivore(String name, String family, AnimalType type, int weight, int lifetime,
                         TimeOfActivity timeOfActivity, String animalsForFood, int weightOfMeatPerDay) {
        super(name, family, type, weight, lifetime, timeOfActivity, weightOfMeatPerDay);
        this.animalsForFood = animalsForFood;
    }

    public String getAnimalsForFood() {
        return animalsForFood;
    }

    public void setAnimalsForFood(String animalsForFood) {
        this.animalsForFood = animalsForFood;
    }

}
