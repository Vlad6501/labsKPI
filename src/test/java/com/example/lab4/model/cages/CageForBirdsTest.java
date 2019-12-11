package com.example.lab4.model.cages;

import com.example.lab4.exceptions.NoSpaceForAnimalException;
import com.example.lab4.exceptions.NoSuchAnimal;
import com.example.lab4.model.animals.Animal;
import com.example.lab4.model.animals.birds.Eagle;
import com.example.lab4.model.animals.mammals.Lion;
import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CageForBirdsTest {
    private Cage cageForBirds;
    private Animal lion;
    private Animal eagle2;
    private Animal eagle;


    @BeforeAll
    void init() {
        cageForBirds = new CageForBirds();
        lion = new Lion();
        eagle2 = new Eagle();
        eagle = new Eagle();
    }

    @Test
    public void shoulThrowExceptionWhenNotBirdAdded() {
        assertThrows(IllegalArgumentException.class,
                () -> cageForBirds.addAnimal(lion));
        assertEquals(0, cageForBirds.getNumberOfFilledSpace());
        CageForBirds.birdsInCage.clear();
    }

    @Test
    @SneakyThrows
    void shoudThrowNoSpaceForAnimalExceptionIfSizeOfCageMoreOrEquals10() throws NoSpaceForAnimalException {
        for (int i = 0; i < 10; i++) {
            Animal bird = new Eagle();
            cageForBirds.addAnimal(bird);
        }
        assertThrows(NoSpaceForAnimalException.class,
                () -> cageForBirds.addAnimal(eagle));
        CageForBirds.birdsInCage.clear();
    }

    @Test
    @SneakyThrows
    void shouldThrowExceptionWhenCallRemoveAnimalWithNoSuchArgumentInCollection() throws NoSpaceForAnimalException {
        cageForBirds.addAnimal(eagle);
        assertThrows(NoSuchAnimal.class, () -> cageForBirds.removeAnimalFromCage(eagle2));
        CageForBirds.birdsInCage.clear();
    }

    @Test
    @SneakyThrows
    void shouldRemoveBirdFromBirdsCage() throws NoSpaceForAnimalException, NoSuchAnimal {
        cageForBirds.addAnimal(eagle);
        cageForBirds.removeAnimalFromCage(eagle);
        assertEquals(0, cageForBirds.getNumberOfFilledSpace());
        CageForBirds.birdsInCage.clear();
    }


}
