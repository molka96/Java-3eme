public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Feline", "Simba", 5, true);
        Animal[] animals = new Animal[25];
        Zoo myZoo = new Zoo("My Zoo", "Tunis", 20 , animals);
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(lion);
        System.out.println(myZoo.toString());
        System.out.println(lion.toString());
    }
}