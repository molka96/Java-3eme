package entities;

public class Departement implements Comparable<Departement> {

    private int id;
    private String nomDepartement;
    private int nombreEmployes;

    // Constructeur par défaut
    public Departement() {
    }

    // Constructeur paramétré
    public Departement(int id, String nomDepartement, int nombreEmployes) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nombreEmployes = nombreEmployes;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public void setNombreEmployes(int nombreEmployes) {
        this.nombreEmployes = nombreEmployes;
    }

    // Egalite selon id et nomDepartement
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || !(obj instanceof Departement)) {
            return false;
        }

        Departement autre = (Departement) obj;

        return this.id == autre.id
                && this.nomDepartement.equals(autre.nomDepartement);
    }

    // Necessaire pour le fonctionnement correct du HashSet
    @Override
    public int hashCode() {
        return 31 * id + nomDepartement.hashCode();
    }

    // Tri naturel par id
    @Override
    public int compareTo(Departement autre) {
        return this.id - autre.id;
    }

    // Affichage
    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", nombreEmployes=" + nombreEmployes +
                '}';
    }
}
