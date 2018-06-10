package animals;

import enums.AnimalType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrueCarnivoreTest {
    private TrueCarnivore trueCarnivore;

    @BeforeEach
    void setUp() {
        trueCarnivore = new TrueCarnivore(8,"Jakal", "Canidae",
                AnimalType.CARNIVORE, 13, 12, 4);
    }

    @Test
    void getFoodWeightPerDay() {
        assertEquals(4, trueCarnivore.getWeightOfFood());
    }
}