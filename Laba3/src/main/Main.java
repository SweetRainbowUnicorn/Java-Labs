package main;

import animals.Herbivore;
import animals.TrueCarnivore;
import animals.Vulture;
import enums.AnimalType;
import enums.TimeOfActivity;
import savanna.Savanna;
import savanna.SavannaAnimal;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void PrintList(List<SavannaAnimal> List) {
        List.forEach((SavannaAnimal x) -> {
            System.out.println(x.toString());
        });
    }

    public static void main(String[] args) {
        Savanna savanna = new Savanna(Savanna.Season.DRY, Savanna.Mainland.AFRICA, 54578.47);

        savanna.addAnimal(new Herbivore("Elephant", "Elephantidae", AnimalType.HERBIVORE,
                5400, 47, "leaves and grass"));
        savanna.addAnimal(new Herbivore("Zebra", "Equidae", AnimalType.HERBIVORE,
                220, 21, "leaves, grass and roots"));
        savanna.addAnimal(new Herbivore("Antelope", "Cavicornia", AnimalType.HERBIVORE,
                620, 16, "leaves, grass and shoots"));
        savanna.addAnimal(new Vulture("Griffon", "Accipitridae", AnimalType.CARNIVORE,
                8, 20, TimeOfActivity.DAY, 100, 264, 2));
        savanna.addAnimal(new TrueCarnivore("Lion", "Felidae", AnimalType.CARNIVORE,
                201, 7, TimeOfActivity.DAY, "Zebras, gnus and giraffes", 7));
        savanna.addAnimal(new Vulture("Condor", "Cathartidae", AnimalType.CARNIVORE,
                13, 53, TimeOfActivity.DAY, 110, 287, 5));
        savanna.addAnimal(new TrueCarnivore("Spotted Hyena", "Hyaenidae", AnimalType.CARNIVORE,
                47, 6, TimeOfActivity.NIGHT, "Zebras, gnus, lions, rhinos and carrion", 5));
        savanna.addAnimal(new TrueCarnivore("Jakal", "Canidae", AnimalType.CARNIVORE, 13, 12,
                TimeOfActivity.NIGHT, "Small animals, birds, carrion", 4));

        System.out.println("What do you want to see?(enter the number)" + "\n" + "1.Information about savanna" + "\n" +
        "2.List of animals living in this savanna" + "\n" + "3.List of carnivores that eat more than 5 kg of meat per day" + "\n" +
        "4.Sorted list of carnivores that eat more than 5 kg of meat per day");
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            switch (num) {
                case 1: {
                    System.out.println("Information about savanna");
                    System.out.println(savanna.toString());
                    break;
                }
                case 2: {
                    System.out.println("List of animals living in this savanna");
                    PrintList(savanna.getAnimals());
                    break;
                }
                case 3: {
                    System.out.println("List of carnivores that eat more than 5 kg of meat per day");
                    List<SavannaAnimal> animals = savanna.findBigCarnivores(5);
                    for (SavannaAnimal animal : animals) {
                        System.out.println(animal);
                    }
                    break;
                }
                case 4: {
                    System.out.println("Sorted list of carnivores that eat more than 5 kg of meat per day");
                    List<SavannaAnimal> animals = savanna.findBigCarnivores(5);
                    savanna.sortByName(animals);
                    for (SavannaAnimal animal : animals) {
                        System.out.println(animal);
                    }
                    break;
                }

            }

        }

       // List<SavannaAnimal> animals = savanna.findBigCarnivores(5);
     //   savanna.sortByName(animals);
       // for (SavannaAnimal animal : animals) {
       //     System.out.println(animal);
     //   }


    }


