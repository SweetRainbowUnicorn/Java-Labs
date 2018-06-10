package animals;

import enums.AnimalType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HerbivoreTest {
    private Herbivore herbivore;

    @BeforeEach
    void setUp() {
        herbivore = new Herbivore(2,"Zebra", "Equidae",
                AnimalType.HERBIVORE, 156,18, "leaves, grass and roots");
    }
    @Test
    void getPlantsForFood(){
        assertEquals(23, herbivore.getPlantsForFood());
    }

    @Test
    void getFoodWeightPerDay() {
        assertEquals(23, herbivore.getWeightOfFood());
    }
}