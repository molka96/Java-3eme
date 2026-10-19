
package main;

import entities.Animal;
import entities.Zoo;
import entities.Aquatic;
import entities.Terrestrial;
import entities.Dolphin;
import entities.Penguin;

public class Main {

    public static void main(String[] args) {

        // Animaux du zoo : code des Prosits precedents
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

        // Prosit 5 : nouvelles classes

        Aquatic aquatic = new Aquatic(
                "Fish", "Nemo", 2, false, "Ocean");

        Terrestrial terrestrial = new Terrestrial(
                "Feline", "Leo", 5, true, 4);

        Dolphin dolphin = new Dolphin(
                "Cetacean", "Flipper", 8, true, "Ocean", 30.5f);

        Penguin penguin = new Penguin(
                "Bird", "Pingu", 3, false, "Ocean", 20.0f);

        // Affichage des objets
        System.out.println("\nAquatic:");
        System.out.println(aquatic);

        System.out.println("\nTerrestrial:");
        System.out.println(terrestrial);

        System.out.println("\nDolphin:");
        System.out.println(dolphin);

        System.out.println("\nPenguin:");
        System.out.println(penguin);

        // Comportement de nage
        System.out.println("\nSwimming:");

        aquatic.swim();
        dolphin.swim();
        penguin.swim();
    }
}
