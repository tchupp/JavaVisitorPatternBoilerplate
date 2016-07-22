package com.kata.animals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DogTest {

    @Test
    public void implementsAnimalInterface() throws Exception {
        Class<?>[] interfaces = Dog.class.getInterfaces();

        assertEquals(1, interfaces.length);
        assertEquals(IAnimal.class, interfaces[0]);
    }

    @Test
    public void noiseReturnsBark() throws Exception {
        Dog dog = new Dog();

        assertEquals("Bark", dog.noise());
    }
}