package animals;

import enums.AnimalType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarnivoreTest {
    private Carnivore carnivore;

    @BeforeEach
    void setUp() {
        carnivore = new Carnivore(9,"Spotted Hyena", "Hyaenidae",
                AnimalType.CARNIVORE, 47, 6, 5);
    }

    @Test
    void getFoodWeightPerDay() {
        assertEquals(5, carnivore.getWeightOfFood());
    }

}