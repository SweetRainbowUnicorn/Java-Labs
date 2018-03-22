package savanna;

import enums.AnimalType;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Savanna {
    public enum Season { DRY, WET }

    public enum Mainland { AFRICA, AMERICA, ASIA, AUSTRALIA, INDIA }

    private double area;
    private Season season;
    private Mainland mainland;
    private List<SavannaAnimal> animals = new LinkedList<>();
    private List<SavannaAnimal> result = new LinkedList<>();

    public int getResult() {
        return result.size();
    }

    public Savanna(final Season season, final Mainland mainland,
                   final double area) {
        this.area = area;
        this.mainland = mainland;
        this.season = season;
    }

    public final List<SavannaAnimal> findBigCarnivores(final int mealWeight) {
        for (SavannaAnimal animal : animals) {
            if (animal.getType() == AnimalType.CARNIVORE
                    && animal.getFoodWeightPerDay() >= mealWeight) {
                result.add(animal);
            }
        }
        return result;
    }

    public final void sortByName(final List<SavannaAnimal> list) {
        list.sort(Comparator.comparing(SavannaAnimal::getName));
    }

    @Override
    public final String toString() {
        return "Savanna:" + "\n"
                + "area=" + area
                + ", season=" + season
                + ", mainland=" + mainland
                + '}';
    }

    public final void addAnimal(final SavannaAnimal animal) {
        this.animals.add(animal);
    }

    public final List<SavannaAnimal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<SavannaAnimal> animals) {
        this.animals = animals;
    }
}
