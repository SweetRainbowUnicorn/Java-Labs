package animals;

import savanna.SavannaAnimal;
import enums.AnimalType;

public class Herbivore extends SavannaAnimal{
	private String plantsForFood;
	
	public Herbivore(String name, String family, AnimalType type, int weight, int lifetime, String plantsForFood) {
		super(name,family, type, weight, lifetime);
		this.plantsForFood=plantsForFood;
	}

	public String getPlantsForFood() {
		return plantsForFood;
	}

	public void setPlantsForFood(String plantsForFood) {
		this.plantsForFood = plantsForFood;
	}

	@Override
	public int getFoodWeightPerDay() {
		// FIXME: food count should not depends on the lenght of food plants String
		return plantsForFood.length();
	}
	
	
}
