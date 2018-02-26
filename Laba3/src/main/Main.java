package main;

import enums.TimeOfActivity;
import savanna.Savanna;
import enums.AnimalType;
import animals.Herbivore;
import animals.TrueCarnivore;
import animals.Vulture;

public class Main {

	public static void main(String[] args) {
		Savanna savanna = new Savanna(Savanna.Season.DRY, Savanna.Mainland.AFRICA, 54578.47);
		
		savanna.addAnimal(new Herbivore("Elephant", "Elephantidae", AnimalType.HERBIVORES, 5400, 47, "leaves and grass"));
		Herbivore zebra = new Herbivore("Zebra", "Equidae", AnimalType.HERBIVORES, 220, 21, "leaves, grass and roots");
		Herbivore antelope = new Herbivore("Antelope", "Cavicornia", AnimalType.HERBIVORES, 620, 16,"leaves, grass and shoots");
		Vulture condor = new Vulture("Condor", "Cathartidae", AnimalType.CARNIVORES, 13, 53, TimeOfActivity.DAY, 
				110, 287, 2);
		Vulture griffon = new Vulture("Griffon", "Accipitridae", AnimalType.CARNIVORES, 8, 20, TimeOfActivity.DAY, 100, 264, 2);
		TrueCarnivore lion = new TrueCarnivore("Lion", "Felidae", AnimalType.CARNIVORES, 201, 7, TimeOfActivity.DAY, 
				"Zebras, gnus and giraffes", 7);
		TrueCarnivore spottedHyena = new TrueCarnivore("Spotted Hyena", "Hyaenidae", AnimalType.CARNIVORES, 47, 6, 
				TimeOfActivity.NIGHT, "Zebras, gnus, lions, rhinos and carrion", 5);
		TrueCarnivore jackal = new TrueCarnivore("Jakal","Canidae", AnimalType.CARNIVORES, 9, 12,
				TimeOfActivity.NIGHT, "Small animals, birds, carrion", 1);
		
	}

}
