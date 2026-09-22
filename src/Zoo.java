public class Zoo {
    String name;
    String city;
    int nbrCages;
    Animal[] animals;
    public Zoo(String name, String city, int nbrCages , Animal[] animals)
    {
        this.animals = animals;
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
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

