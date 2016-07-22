package com.kata.animals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RabbitTest {

    @Test
    public void implementsAnimalInterface() throws Exception {
        Class<?>[] interfaces = Rabbit.class.getInterfaces();

        assertEquals(1, interfaces.length);
        assertEquals(IAnimal.class, interfaces[0]);
    }

    @Test
    public void noiseReturnsBark() throws Exception {
        Rabbit rabbit = new Rabbit();

        assertEquals("Squeak", rabbit.noise());
    }
}