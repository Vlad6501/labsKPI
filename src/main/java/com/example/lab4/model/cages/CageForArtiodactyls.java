package com.example.lab4.model.cages;

import com.example.lab4.exceptions.NoSpaceForAnimalException;
import com.example.lab4.exceptions.NoSuchAnimal;
import com.example.lab4.model.animals.Animal;
import com.example.lab4.model.animals.mammals.Artiodactyls;

import java.util.ArrayList;
import java.util.List;

public class CageForArtiodactyls implements CageForMammals {
    public static List<Artiodactyls> artiodactylsInCage = new ArrayList<>();

    @Override
    public int getNumberOfFilledSpace() {
        return artiodactylsInCage.size();
    }

    @Override
    public void removeAnimalFromCage(Animal animal) throws NoSuchAnimal {
        if (!(animal instanceof Artiodactyls)) {
            throw new IllegalArgumentException("this is not artiodactyl");
        }
        if (!artiodactylsInCage.contains(animal)) {
            throw new NoSuchAnimal();
        }
        artiodactylsInCage.remove(animal);

    }

    @Override
    public void addAnimal(Animal animal) throws NoSpaceForAnimalException {
        if (!(animal instanceof Artiodactyls)) {
            throw new IllegalArgumentException("this is not artiodactyl");
        }

        if (artiodactylsInCage.size() >= maxSizeOfCage) {
            throw new NoSpaceForAnimalException();
        }
        Artiodactyls artiodactyl = (Artiodactyls) animal;
        artiodactylsInCage.add(artiodactyl);
    }
}
