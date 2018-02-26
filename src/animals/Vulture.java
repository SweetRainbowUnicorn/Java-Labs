package animals;

import enums.TimeOfActivity;
import enums.AnimalType;

public class Vulture extends Carnivore{
    private double length;
    private double wingspan;

    public Vulture(String name, String family, AnimalType type, int weight, int lifetime,
                   TimeOfActivity timeOfActivity, int lenght, int wingspan, int weightOfMeatPerDay) {
        super(name, family, type, weight, lifetime, timeOfActivity, weightOfMeatPerDay);
        this.length=length;
        this.wingspan=wingspan;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }


}
