# Java Visitor Pattern Boilerplate

Boilerplate project for learning/brushing up on the Object Oriented Programming (OOP) pattern - Visitor Pattern

*This project is configured for IntelliJ. Feel free to use any IDE you wish.*

##### First part in my series for devs wishing to learn or practice OOP patterns
Also known as a *behavioral* pattern, visitor pattern is used to manage algorithms and relationships by treating concrete objects differently when given an abstraction.
Visitor pattern can be one of the most confusing patterns to learn. There are tons of resources on the web explaining how to implement this pattern,  but many of them can be confusing and most don't talk about Test Driven Development. This project contains a boilerplate for practicing the visitor pattern by providing an interface (IAnimal) and three concretes (Dog, Cat, Rabbit).

The goal is to create a visitor to count the number of different animals in a house by only adding functionality to the provided classes.
The first test in Household purposefully doesn't compile, and is meant to be the starting place for the visitor pattern.
The boilerplate also provides a method in Household that shows the incorrect way to solve the problem.