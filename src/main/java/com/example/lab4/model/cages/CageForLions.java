package com.example.lab4.model.cages;

import com.example.lab4.exceptions.NoSpaceForAnimalException;
import com.example.lab4.exceptions.NoSuchAnimal;
import com.example.lab4.model.animals.Animal;
import com.example.lab4.model.animals.birds.Bird;
import com.example.lab4.model.animals.mammals.Artiodactyls;
import com.example.lab4.model.animals.mammals.Lion;

import java.util.ArrayList;
import java.util.List;

public class CageForLions implements CageForMammals {

    public static List<Lion> lionsInCage = new ArrayList<>();

    @Override
    public int getNumberOfFilledSpace() {
        return lionsInCage.size();
    }

    @Override
    public void removeAnimalFromCage(Animal animal) throws NoSuchAnimal {
        if (!(animal instanceof Artiodactyls)) {
            throw new IllegalArgumentException("this is not lion");
        }
        if (!lionsInCage.contains(animal)) {
            throw new NoSuchAnimal();
        }
        lionsInCage.remove(animal);
    }

    @Override
    public void addAnimal(Animal animal) throws NoSpaceForAnimalException {
        if (!(animal instanceof Bird)) {
            throw new IllegalArgumentException("this is not bird");
        }

        if (lionsInCage.size() >= maxSizeOfCage) {
            throw new NoSpaceForAnimalException();
        }
        Lion lion = (Lion) animal;
        lionsInCage.add(lion);
    }
}
