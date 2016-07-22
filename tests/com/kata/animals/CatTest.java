package com.kata.animals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatTest {

    @Test
    public void implementsAnimalInterface() throws Exception {
        Class<?>[] interfaces = Cat.class.getInterfaces();

        assertEquals(1, interfaces.length);
        assertEquals(IAnimal.class, interfaces[0]);
    }

    @Test
    public void noiseReturnsBark() throws Exception {
        Cat cat = new Cat();

        assertEquals("Meow", cat.noise());
    }
}