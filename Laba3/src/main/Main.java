package main;

import enums.TimeOfActivity;
import savanna.Savanna;
import enums.AnimalType;
import animals.Herbivore;
import animals.TrueCarnivore;
import animals.Vulture;
import savanna.SavannaAnimal;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Savanna savanna = new Savanna(Savanna.Season.DRY, Savanna.Mainland.AFRICA, 54578.47);

        savanna.addAnimal(new Herbivore("Elephant", "Elephantidae", AnimalType.HERBIVORE,
                5400, 47, "leaves and grass"));
        savanna.addAnimal(new Herbivore("Zebra", "Equidae", AnimalType.HERBIVORE,
                220, 21, "leaves, grass and roots"));
        savanna.addAnimal(new Herbivore("Antelope", "Cavicornia", AnimalType.HERBIVORE,
                620, 16,"leaves, grass and shoots"));
        savanna.addAnimal(new Vulture("Condor", "Cathartidae", AnimalType.CARNIVORE,
                13, 53, TimeOfActivity.DAY,110, 287, 5));
        savanna.addAnimal(new Vulture("Griffon", "Accipitridae", AnimalType.CARNIVORE,
                8, 20, TimeOfActivity.DAY, 100, 264, 2));
        savanna.addAnimal(new TrueCarnivore("Lion", "Felidae", AnimalType.CARNIVORE,
                201, 7, TimeOfActivity.DAY, "Zebras, gnus and giraffes", 7));
        savanna.addAnimal(new TrueCarnivore("Spotted Hyena", "Hyaenidae", AnimalType.CARNIVORE,
                47, 6, TimeOfActivity.NIGHT, "Zebras, gnus, lions, rhinos and carrion", 5));
        savanna.addAnimal(new TrueCarnivore("Jakal","Canidae", AnimalType.CARNIVORE, 13, 12,
                TimeOfActivity.NIGHT, "Small animals, birds, carrion", 4));
        System.out.println(savanna.toString());

        List<SavannaAnimal> animals = savanna.findBigCarnivores(5);
        savanna.sortByName(animals);
        for (SavannaAnimal animal: animals) {
            System.out.println(animal);
        }


    }

}
