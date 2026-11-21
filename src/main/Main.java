package main;

import entities.Animal;
import entities.Zoo;
import entities.Terrestrial;
import entities.Dolphin;
import entities.Penguin;
import entities.ZooFullException;
import entities.InvalidAgeException;

public class Main {

    public static void main(String[] args) {

        // Création du zoo avec 3 cages
        Zoo myZoo = new Zoo("My Zoo", "Tunis", 3);

        // Création des animaux
        Animal lion = new Animal("Feline", "Simba", 5, true);
        Animal invalidAnimal = new Animal("Feline", "BadAge", -2, true);
        Animal tiger = new Animal("Feline", "Tiger", 4, true);
        Animal eagle = new Animal("Bird", "Eagle", 3, false);
        Animal zebra = new Animal("Equine", "Zebra", 6, false);

        // Instruction 33 et 34 : gestion des exceptions

        System.out.println("Adding lion:");
        try {
            myZoo.addAnimal(lion);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Total animals: " + myZoo.countAnimals());

        System.out.println("\nAdding animal with negative age:");
        try {
            myZoo.addAnimal(invalidAnimal);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Total animals: " + myZoo.countAnimals());

        System.out.println("\nAdding tiger:");
        try {
            myZoo.addAnimal(tiger);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Total animals: " + myZoo.countAnimals());

        System.out.println("\nAdding eagle:");
        try {
            myZoo.addAnimal(eagle);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Total animals: " + myZoo.countAnimals());

        // Tentative d'ajout lorsque le zoo est plein
        System.out.println("\nAdding zebra:");
        try {
            myZoo.addAnimal(zebra);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Total animals: " + myZoo.countAnimals());

        // Affichage des animaux du zoo
        System.out.println("\nAnimals in the zoo:");
        myZoo.displayAnimals();

        System.out.println("\nZoo information:");
        myZoo.displayZoo();

        System.out.println("\nIs the zoo full?");
        System.out.println(myZoo.isZooFull());

        // Recherche et suppression
        System.out.println("\nSearch for lion:");
        System.out.println(myZoo.searchAnimal(lion));

        System.out.println("\nRemove lion:");
        System.out.println(myZoo.removeAnimal(lion));

        System.out.println("\nAnimals after removing lion:");
        myZoo.displayAnimals();

        // Prosit 5 : création des animaux
        Terrestrial terrestrial = new Terrestrial(
                "Feline", "Leo", 5, true, 4);

        Dolphin dolphin = new Dolphin(
                "Cetacean", "Flipper", 8, true, "Ocean", 30.5f);

        Penguin penguin = new Penguin(
                "Bird", "Pingu", 3, false, "Ocean", 20.0f);

        Penguin penguin2 = new Penguin(
                "Bird", "Tux", 4, false, "Antarctica", 25.0f);

        // Prosit 6 : affichage des objets
        System.out.println("\nTerrestrial:");
        System.out.println(terrestrial);

        System.out.println("\nDolphin:");
        System.out.println(dolphin);

        System.out.println("\nPenguin:");
        System.out.println(penguin);

        // Prosit 6 : ajout des animaux aquatiques
        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin);
        myZoo.addAquaticAnimal(penguin2);

        // Instruction 26
        System.out.println("\nSwimming:");
        myZoo.displayAquaticAnimals();

        // Instruction 27
        System.out.println("\nMaximum penguin swimming depth:");
        System.out.println(myZoo.maxPenguinSwimmingDepth());

        // Instruction 28
        System.out.println("\nNumber of aquatic animals by type:");
        myZoo.displayNumberOfAquaticsByType();

        // Instruction 31
        System.out.println("\nEquals test:");
        Penguin penguin3 = new Penguin(
                "Bird", "Pingu", 3, false, "Ocean", 30.0f);

        System.out.println(penguin.equals(penguin3));
    }
}
