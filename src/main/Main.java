package main;

import entities.Animal;
import entities.Zoo;

public class Main {

    public static void main(String[] args) {

        Animal lion = new Animal("Feline", "Simba", 5, true);
        Animal tiger = new Animal("Feline", "Tiger", 4, true);
        Animal eagle = new Animal("Bird", "Eagle", 3, false);

        Zoo myZoo = new Zoo("My Zoo", "Tunis", 3);

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(tiger));
        System.out.println(myZoo.addAnimal(eagle));

        System.out.println("Animals in the zoo:");
        myZoo.displayAnimals();

        System.out.println("Zoo information:");
        myZoo.displayZoo();

        System.out.println("Is the zoo full?");
        System.out.println(myZoo.isZooFull());

        System.out.println("Search for lion:");
        System.out.println(myZoo.searchAnimal(lion));

        System.out.println("Remove lion:");
        System.out.println(myZoo.removeAnimal(lion));

        System.out.println("Animals after removing lion:");
        myZoo.displayAnimals();
    }
}
