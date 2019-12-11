package com.example.lab4.model.cages;


import com.example.lab4.exceptions.NoSpaceForAnimalException;
import com.example.lab4.exceptions.NoSuchAnimal;
import com.example.lab4.model.animals.Animal;

public interface Cage {
    int maxSizeOfCage = 10;

    int getNumberOfFilledSpace();

    void removeAnimalFromCage(Animal animal) throws NoSuchAnimal;

    void addAnimal(Animal animal) throws NoSpaceForAnimalException;

    static int animalsInCages() {
        return CageForLions.lionsInCage.size()
                + CageForArtiodactyls.artiodactylsInCage.size()
                + CageForBirds.birdsInCage.size();
    }

    default void getMaxSizeOfCage() {
        System.out.println(maxSizeOfCage);
    }
}
