package entities;

public class Zoo {

    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;

    private int nbrAnimals = 0;

    public Zoo(String name, String city, int nbrCages) {
        setName(name);
        this.city = city;
        this.nbrCages = nbrCages;
        animals = new Animal[nbrCages];
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.equals("")) {
            System.out.println("The zoo name must not be empty");
        } else {
            this.name = name;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public void setNbrCages(int nbrCages) {
        this.nbrCages = nbrCages;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public boolean isZooFull() {
        return nbrAnimals >= nbrCages;
    }

    public boolean addAnimal(Animal animal) {

        if (isZooFull()) {
            return false;
        }

        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return false;
            }
        }

        animals[nbrAnimals] = animal;
        nbrAnimals++;

        return true;
    }

    public void displayAnimals() {

        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {

        for (int i = 0; i < nbrAnimals; i++) {

            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }

        return -1;
    }

    public boolean removeAnimal(Animal animal) {

        int index = searchAnimal(animal);

        if (index == -1) {
            return false;
        }

        for (int i = index; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[nbrAnimals - 1] = null;
        nbrAnimals--;

        return true;
    }

    public void displayZoo() {

        System.out.println("Zoo name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of cages: " + nbrCages);
        System.out.println("Number of animals: " + nbrAnimals);
    }

    public String toString() {

        return "Zoo name: " + name
                + ", City: " + city
                + ", Number of cages: " + nbrCages
                + ", Number of animals: " + nbrAnimals;
    }
}
