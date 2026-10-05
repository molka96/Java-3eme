public class Zoo {
    String name;
    String city;
    int nbrCages;
    Animal[] animals;

    int nbrAnimals = 0;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;

        if (nbrCages > 25) {
            this.nbrCages = 25;
        } else {
            this.nbrCages = nbrCages;
        }

        animals = new Animal[this.nbrCages];
    }

    public boolean addAnimal(Animal animal) {

        if (nbrAnimals >= nbrCages) {
            return false;
        }

        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].name.equals(animal.name)) {
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

            if (animals[i].name.equals(animal.name)) {
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

    public boolean isFull() {

        return nbrAnimals >= nbrCages;
    }

    public static Zoo compareZoo(Zoo zoo1, Zoo zoo2) {

        if (zoo1.nbrAnimals > zoo2.nbrAnimals) {
            return zoo1;
        } else {
            return zoo2;
        }
    }
    void displayZoo() {
        System.out.println(name);
        System.out.println(city);
        System.out.println(nbrCages);
    }
    public String toString() {
        return "Zoo name: " + name + ", City: " + city + ", Number of cages: " + nbrCages;
    }

}

