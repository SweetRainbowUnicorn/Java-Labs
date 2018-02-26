package savanna;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import enums.AnimalType;

public class Savanna {
    public enum Season {DRY, WET};
    public enum Mainland {AFRICA, AMERICA, ASIA, AUSTRALIA, INDIA};
    private double area;

    private Season season;
    private Mainland mainland;

    public Savanna(Season season, Mainland mainland, double area) {
        this.area=area;
        this.mainland=mainland;
        this.season=season;
    }

    private List<SavannaAnimal> animals = new LinkedList<>();
    private List<SavannaAnimal> result = new LinkedList<>();
    public List<SavannaAnimal> findBigCarnivores(int mealWeight) {
        for (SavannaAnimal animal : animals) {
            if (animal.getType() == AnimalType.CARNIVORE && animal.getFoodWeightPerDay() >= mealWeight) {
                result.add(animal);
            }
        }
        return result;
    }

    public void sortByName(List<SavannaAnimal> list){
        list.sort(Comparator.comparing(SavannaAnimal::getName));
    }



    @Override
    public String toString() {
        return "Savanna{" +
                "area=" + area +
                ", season=" + season +
                ", mainland=" + mainland +
                ", animals=" + animals +
                '}';
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public Mainland getMainland() {
        return mainland;
    }

    public void setMainland(Mainland mainland) {
        this.mainland = mainland;
    }

    public void addAnimal(SavannaAnimal animal) {
        this.animals.add(animal);
    }

    public List<SavannaAnimal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<SavannaAnimal> animals) {
        this.animals = animals;
    }

    public List<SavannaAnimal> getResult() {
        return result;
    }

    public void setResult(List<SavannaAnimal> result) {
        this.result = result;
    }
}
