public class Main {

    public static void main(String[] args) {

        Animal lion = new Animal("Feline", "Simba", 5, true);
        Animal tiger = new Animal("Feline", "Tiger", 4, true);
        Animal eagle = new Animal("Bird", "Eagle", 3, false);
        Animal elephant = new Animal("Elephant", "Dumbo", 10, true);

        Zoo myZoo = new Zoo("My Zoo", "Tunis", 4);

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(tiger));
        System.out.println(myZoo.addAnimal(eagle));

        System.out.println("Animals in the zoo:");
        myZoo.displayAnimals();

        System.out.println("Search for lion:");
        System.out.println(myZoo.searchAnimal(lion));

        Animal anotherLion = new Animal("Feline", "Simba", 5, true);

        System.out.println("Search for another lion:");
        System.out.println(myZoo.searchAnimal(anotherLion));

        System.out.println("Trying to add the same animal:");
        System.out.println(myZoo.addAnimal(anotherLion));

        System.out.println("Add another animal:");
        System.out.println(myZoo.addAnimal(elephant));

        System.out.println("Is the zoo full?");
        System.out.println(myZoo.isFull());

        System.out.println("Remove lion:");
        System.out.println(myZoo.removeAnimal(lion));

        System.out.println("Animals after removing lion:");
        myZoo.displayAnimals();

        Zoo zoo2 = new Zoo("Zoo 2", "Sousse", 5);

        zoo2.addAnimal(lion);
        zoo2.addAnimal(tiger);

        System.out.println("Zoo with more animals:");

        Zoo biggerZoo = Zoo.compareZoo(myZoo, zoo2);

        System.out.println(biggerZoo);
    }
}