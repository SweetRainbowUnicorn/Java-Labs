package animals;

import enums.AnimalType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VultureTest {
    private Vulture vulture;

    @BeforeEach
    void setUp() {
        vulture = new Vulture("Condor", "Cathartidae",
                AnimalType.CARNIVORE, 13, 53, 5);
    }

    @Test
    void getFoodWeightPerDay() {
        assertEquals(5,vulture.getFoodWeightPerDay());
    }
}