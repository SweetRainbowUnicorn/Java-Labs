package savanna;

import java.util.LinkedList;
import java.util.List;
import animals.Carnivore;
import animals.Herbivore;
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

	public List<SavannaAnimal> find(int mealWeight) {
		List<SavannaAnimal> result = new LinkedList<>();
		for (SavannaAnimal animal : animals) {
			if (animal.getType() == AnimalType.CARNIVORES && animal.getFoodWeightPerDay() > mealWeight) {
				result.add(animal);
			}
		}
		return result;
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
	
	
}
