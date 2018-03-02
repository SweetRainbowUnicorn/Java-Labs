package savanna;
import animals.Herbivore;
import animals.TrueCarnivore;
import animals.Vulture;
import enums.AnimalType;

import java.util.List;

public class Main {
    private static void printList(final List<SavannaAnimal> List) {
        List.forEach((SavannaAnimal x) -> System.out.println(x.toString()));
    }

        public static void main(final String[] args) {
            Savanna savanna = new Savanna(Savanna.Season.DRY,
                    Savanna.Mainland.AFRICA, 5457.47);
            savanna.addAnimal(new Herbivore("Elephant", "Elephantidae",
                    AnimalType.HERBIVORE, 5400, 47, "leaves and grass"));
            savanna.addAnimal(new Herbivore("Zebra", "Equidae",
                    AnimalType.HERBIVORE, 220, 21, "leaves, grass and roots"));
            savanna.addAnimal(new Herbivore("Antelope", "Cavicornia",
                    AnimalType.HERBIVORE, 620, 16, "leaves, grass and shoots"));
            savanna.addAnimal(new Vulture("Griffon", "Accipitridae",
                    AnimalType.CARNIVORE, 8, 20, 2));
            savanna.addAnimal(new TrueCarnivore("Lion", "Felidae",
                    AnimalType.CARNIVORE, 201, 7, 7));
            savanna.addAnimal(new Vulture("Condor", "Cathartidae",
                    AnimalType.CARNIVORE, 13, 53,
                    5));
            savanna.addAnimal(new TrueCarnivore("Spotted Hyena", "Hyaenidae",
                    AnimalType.CARNIVORE, 47, 6, 5));
            savanna.addAnimal(new TrueCarnivore("Jakal", "Canidae",
                    AnimalType.CARNIVORE, 13, 12, 4));

            System.out.println(savanna.toString());
            printList(savanna.getAnimals());
            System.out.println("Animals that eat more than 5 kg of meat per day:");
            List<SavannaAnimal> animals = savanna.findBigCarnivores(5);
            savanna.sortByName(animals);
            for (SavannaAnimal animal : animals) {
                System.out.println(animal);

            }
        }
}