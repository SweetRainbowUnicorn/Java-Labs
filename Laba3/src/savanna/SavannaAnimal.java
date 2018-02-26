package savanna;

import enums.AnimalType;

public abstract class SavannaAnimal {
	private String name;
	private String family;
	private AnimalType type;
	private int weight;
	private int lifetime;
	
	public SavannaAnimal(String name, String family, AnimalType type, int weight, int lifetime) {
		this.name=name;
		this.family=family;
		this.type=type;
		this.weight=weight;
		this.lifetime=lifetime;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getLifetime() {
		return lifetime;
	}

	public void setLifetime(int lifetime) {
		this.lifetime = lifetime;
	}

	public AnimalType getType() {
		return type;
	}

	public void setType(AnimalType type) {
		this.type = type;
	}

	public  abstract int getFoodWeightPerDay();

}
