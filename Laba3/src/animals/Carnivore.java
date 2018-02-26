package animals;

import enums.AnimalType;
import enums.TimeOfActivity;
import savanna.SavannaAnimal;

public class Carnivore extends SavannaAnimal {
    private TimeOfActivity timeOfActivity;
    private int weightOfMeatPerDay;

    public Carnivore(String name, String family, AnimalType type, int weight, int lifetime,
                     TimeOfActivity timeOfActivity, int weightOfMeatPerDay) {
        super(name, family, type, weight, lifetime);
        this.timeOfActivity = timeOfActivity;
        this.weightOfMeatPerDay = weightOfMeatPerDay;
    }

    public void setWeightOfMeatPerDay(int weightOfMeatPerDay) {
        this.weightOfMeatPerDay = weightOfMeatPerDay;
    }

    public TimeOfActivity getTimeOfActivity() {
        return timeOfActivity;
    }

    public void setTimeOfActivity(TimeOfActivity timeOfActivity) {
        this.timeOfActivity = timeOfActivity;
    }

    @Override
    public int getFoodWeightPerDay() {
        return weightOfMeatPerDay;
    }

}
