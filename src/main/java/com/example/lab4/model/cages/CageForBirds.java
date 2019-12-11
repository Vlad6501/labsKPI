package com.example.lab4.model.cages;

import com.example.lab4.exceptions.NoSpaceForAnimalException;
import com.example.lab4.exceptions.NoSuchAnimal;
import com.example.lab4.model.animals.Animal;
import com.example.lab4.model.animals.birds.Bird;
import java.util.ArrayList;
import java.util.List;

public class CageForBirds implements Cage {
    public static List<Bird> birdsInCage = new ArrayList<>();


    @Override
    public int getNumberOfFilledSpace() {
        return birdsInCage.size();
    }


    @Override
    public void removeAnimalFromCage(Animal animal) throws NoSuchAnimal {
        if (!(animal instanceof Bird)) {
            throw new IllegalArgumentException("this is not bird");
        }
        if (!birdsInCage.contains(animal)) {
            throw new NoSuchAnimal();
        }
        birdsInCage.remove(animal);
    }

    @Override
    public void addAnimal(Animal animal) throws NoSpaceForAnimalException {
        if (!(animal instanceof Bird)) {
            throw new IllegalArgumentException("this is not bird");
        }

        if (birdsInCage.size() >= maxSizeOfCage) {
            throw new NoSpaceForAnimalException();
        }
        Bird bird = (Bird) animal;
        birdsInCage.add(bird);
    }
}
