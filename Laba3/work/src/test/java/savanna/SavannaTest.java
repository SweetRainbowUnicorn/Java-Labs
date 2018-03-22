package savanna;

import animals.Carnivore;
import animals.Herbivore;
import animals.TrueCarnivore;
import animals.Vulture;
import enums.AnimalType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SavannaTest {
    private Savanna savanna;
    private SavannaAnimal lion;
    private SavannaAnimal zebra;
    private SavannaAnimal condor;
    private SavannaAnimal spottedHyena;

    @BeforeEach
    void setUp() {
        savanna = new Savanna(Savanna.Season.WET, Savanna.Mainland.ASIA, 4500.37);
        lion = new Carnivore("Lion", "Felidae",
                AnimalType.CARNIVORE, 201,7, 7);
        zebra = new Herbivore("Zebra", "Equidae", AnimalType.HERBIVORE,
                220, 21, "leaves, grass and roots");
        condor = new Vulture("Condor", "Cathartidae", AnimalType.CARNIVORE,
                13, 53, 5);
        spottedHyena = new TrueCarnivore("Spotted Hyena", "Hyaenidae", AnimalType.CARNIVORE,
                47, 6, 5);

        savanna.addAnimal(lion);
        savanna.addAnimal(zebra);
        savanna.addAnimal(condor);
        savanna.addAnimal(spottedHyena);

    }

    @Test
    void setAnimals(){
        SavannaAnimal lion = new Carnivore("Lion", "Felidae",
                AnimalType.CARNIVORE, 201,7, 7);
        SavannaAnimal zebra = new Herbivore("Zebra", "Equidae", AnimalType.HERBIVORE,
                220, 21, "leaves, grass and roots");
        SavannaAnimal condor = new Vulture("Condor", "Cathartidae", AnimalType.CARNIVORE,
                13, 53, 5);
        SavannaAnimal spottedHyena = new TrueCarnivore("Spotted Hyena", "Hyaenidae", AnimalType.CARNIVORE,
                47, 6, 5);
        List<SavannaAnimal> animalList = new ArrayList<>();
        animalList.add(lion);
        animalList.add(zebra);
        animalList.add(condor);
        animalList.add(spottedHyena);

        savanna.setAnimals(animalList);
        for (int i = 0; i < animalList.size(); i++) {
            assertEquals(animalList.get(i), savanna.getAnimals().get(i));
        }
    }

    @Test
    void getResult(){
        List<SavannaAnimal> foundList = savanna.findBigCarnivores(5);
        assertEquals(3, foundList.size());
    }

    @Test
    void getAnimals(){
        assertEquals(lion, savanna.getAnimals().get(0));
        assertEquals(zebra, savanna.getAnimals().get(1));
        assertEquals(condor, savanna.getAnimals().get(2));
        assertEquals(spottedHyena, savanna.getAnimals().get(3));
    }
    @Test
    void findBigCarnivores() {
        List<SavannaAnimal> foundList = savanna.findBigCarnivores(5);
        assertEquals(3, foundList.size());
        assertEquals(lion, foundList.get(0));
    }

    @Test
    void sortByName() {
        savanna.sortByName(savanna.getAnimals());

        assertEquals(condor, savanna.getAnimals().get(0));
        assertEquals(lion, savanna.getAnimals().get(1));
        assertEquals(spottedHyena, savanna.getAnimals().get(2));
        assertEquals(zebra, savanna.getAnimals().get(3));

    }

    @Test
    void writeToFile(){
        try{
            SavannaAnimalWriter writer = new SavannaAnimalWriter();
            writer.writeToFile(savanna.getAnimals());
        } catch (IOException e){
            assertTrue(false);
        }
        File file = new File("D:\\nulp\\savannaAnimalsList.csv");
        assertEquals(true, file.exists());
    }


}