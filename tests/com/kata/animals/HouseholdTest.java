package com.kata.animals;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class HouseholdTest {

    @Test
    public void acceptCallsAcceptOnEveryAnimalInHousehold() throws Exception {
        IAnimal mockAnimal1 = mock(IAnimal.class);
        IAnimal mockAnimal2 = mock(IAnimal.class);
        IAnimal mockAnimal3 = mock(IAnimal.class);
        IAnimal mockAnimal4 = mock(IAnimal.class);

        IAnimalVisitor mockVisitor = mock(IAnimalVisitor.class);

        List<IAnimal> animalList = Arrays.asList(mockAnimal1, mockAnimal2, mockAnimal3, mockAnimal4);

        Household household = new Household(animalList);

        household.accept(mockVisitor);

        verify(mockAnimal1).accept(mockVisitor);
        verify(mockAnimal2).accept(mockVisitor);
        verify(mockAnimal3).accept(mockVisitor);
        verify(mockAnimal4).accept(mockVisitor);
    }

    @Test
    public void countAnimalsReturnsTheCorrectNumberOfEachAnimal() throws Exception {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        Rabbit rabbit1 = new Rabbit();

        List<IAnimal> animalList = Arrays.asList(dog1, dog2, cat1, cat2, cat3, rabbit1);

        Household household = new Household(animalList);

        Map<String, Integer> animalCountMap = household.countAnimals();

        assertEquals(3, animalCountMap.size());

        assertTrue(animalCountMap.containsKey("Dog"));
        assertTrue(animalCountMap.containsKey("Cat"));
        assertTrue(animalCountMap.containsKey("Rabbit"));

        assertEquals(Integer.valueOf(2), animalCountMap.get("Dog"));
        assertEquals(Integer.valueOf(3), animalCountMap.get("Cat"));
        assertEquals(Integer.valueOf(1), animalCountMap.get("Rabbit"));
    }
}