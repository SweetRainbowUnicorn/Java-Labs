package savanna;

import animals.Carnivore;
import animals.Herbivore;
import animals.TrueCarnivore;
import animals.Vulture;
import enums.AnimalType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SavannaTest {
  /*  private Savanna savanna;
    private SavannaAnimal lion;
    private SavannaAnimal zebra;
    private SavannaAnimal condor;
    private SavannaAnimal spottedHyena;

    @BeforeEach
    void setUp() {

        private static final SavannaAnimal lion = new Carnivore(4,"Lion", "Felidae",
                AnimalType.CARNIVORE, 201,7, 7);
        private static final SavannaAnimal zebra = new Herbivore(5,"Zebra", "Equidae", AnimalType.HERBIVORE,
                220, 2, "leaves, grass and roots");
        private static final SavannaAnimal condor = new Vulture(6,"Condor", "Cathartidae", AnimalType.CARNIVORE,
                13, 53, 5);
        private static final SavannaAnimal spottedHyena = new TrueCarnivore(7,"Spotted Hyena", "Hyaenidae", AnimalType.CARNIVORE,
                47, 6, 5);

        private static final Savanna savanna = new Savanna(Savanna.Season.WET, Savanna.Mainland.ASIA, 4500.37);
        private static final SavannaAnimalWriter writer = new SavannaAnimalWriter();
        private static final File file = new File("savannaAnimalsList.csv");
        private Map<Integer,SavannaAnimal> testMap = new HashMap<>();
        private List<SavannaAnimal> savannaAnimalList = new LinkedList<>(savanna.getSavannaAnimalMap().values());
        private List<SavannaAnimal> testList = new LinkedList<>();

         @BeforeAll
        static void addAnimalToList() {
        savanna.addSavannaAnimalList(lion.getId(),lion);
        savanna.addSavannaAnimalList(zebra.getId(),zebra);
        savanna.addSavannaAnimalList(condor.getId(), condor);
        savanna.addSavannaAnimalList(spottedHyena.getId(), spottedHyena);

    }

    @Test
    void addSavannaAnimalList() {
            assertEquals(lion, savanna.getSavannaAnimalMap().get(4));
    }


    @Test
    void getResult(){
        Map<Integer, SavannaAnimal> foundList = savanna.findBigCarnivores(5);
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
        Map<Integer, SavannaAnimal> foundList = savanna.findBigCarnivores(5);
        assertEquals(3, foundList.size());
        assertEquals(lion, foundList.get(0));
    }



    @Test
    void writeToFile(){
        try {
            writer.writeToFile((List<SavannaAnimal>) savanna.getSavannaAnimalMap());
            } catch (Exception e) {
            assertTrue(false);
            }
        File file = new File("D:\\nulp\\savannaAnimalsList.csv");
        assertEquals(true, file.exists());
    }
    */
}