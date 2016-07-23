package com.kata.animals;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Household {

    private final List<IAnimal> householdPets;

    public Household(final List<IAnimal> householdPets) {
        this.householdPets = householdPets;
    }

    public void accept(final IAnimalVisitor animalVisitor) {
    }

    public Map<String, Integer> countAnimals() {
        int dogCount = 0;
        int catCount = 0;
        int rabbitCount = 0;

        for (IAnimal animal : this.householdPets) {
            switch (animal.noise()) {
                case "Bark":
                    dogCount++;
                    break;
                case "Meow":
                    catCount++;
                    break;
                case "Squeak":
                    rabbitCount++;
                    break;
            }
        }

        Map<String, Integer> animalCountMap = new HashMap<>();
        animalCountMap.put("Dog", dogCount);
        animalCountMap.put("Cat", catCount);
        animalCountMap.put("Rabbit", rabbitCount);
        return animalCountMap;
    }
}
