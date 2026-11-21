package entities;

public class Zoo {
    private Animal[] animals;
    private Aquatic[] aquaticAnimals = new Aquatic[10];
    private String name;
    private String city;
    private int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
    }

    // Prosit 7 - Instructions 32, 33 et 34
    public void addAnimal(Animal animal)
            throws ZooFullException, InvalidAgeException {

        if (animal.getAge() < 0) {
            throw new InvalidAgeException();
        }

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                return;
            }
        }

        throw new ZooFullException();
    }

    public int countAnimals() {
        int count = 0;

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                count++;
            }
        }

        return count;
    }

    public boolean isZooFull() {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                return false;
            }
        }

        return true;
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == animal) {
                return i;
            }
        }

        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);

        if (index != -1) {
            animals[index] = null;
            return true;
        }

        return false;
    }

    public void displayAnimals() {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                System.out.println(animals[i]);
            }
        }
    }

    public void displayZoo() {
        System.out.println("Zoo name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of cages: " + nbrCages);
    }

    // Prosit 6 - Instruction 25
    public void addAquaticAnimal(Aquatic aquatic) {
        for (int i = 0; i < aquaticAnimals.length; i++) {
            if (aquaticAnimals[i] == null) {
                aquaticAnimals[i] = aquatic;
                return;
            }
        }

        System.out.println("The aquatic animals array is full.");
    }

    // Prosit 6 - Instruction 26
    public void displayAquaticAnimals() {
        for (int i = 0; i < aquaticAnimals.length; i++) {
            if (aquaticAnimals[i] != null) {
                aquaticAnimals[i].swim();
            }
        }
    }

    // Prosit 6 - Instruction 27
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;

        for (int i = 0; i < aquaticAnimals.length; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];

                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }

        return maxDepth;
    }

    // Prosit 6 - Instruction 28
    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (int i = 0; i < aquaticAnimals.length; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++;
            }

            if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++;
            }
        }

        System.out.println("Number of dolphins: " + dolphinCount);
        System.out.println("Number of penguins: " + penguinCount);
    }
}
