package main;

import entities.Departement;
import entities.DepartementHashSet;

public class MainDepartements {

    public static void main(String[] args) {

        // Creation de la gestion des departements
        DepartementHashSet gestion = new DepartementHashSet();

        // Creation des departements
        Departement d1 = new Departement(3, "Informatique", 20);
        Departement d2 = new Departement(1, "Finance", 10);
        Departement d3 = new Departement(5, "Ressources Humaines", 15);
        Departement d4 = new Departement(2, "Marketing", 12);
        Departement d5 = new Departement(4, "Informatique", 30);

        // Ajouter les departements
        gestion.ajouterDepartement(d1);
        gestion.ajouterDepartement(d2);
        gestion.ajouterDepartement(d3);
        gestion.ajouterDepartement(d4);
        gestion.ajouterDepartement(d5);

        // Afficher les departements
        System.out.println("Liste des departements :");
        gestion.afficherDepartements();

        // Recherche par nom
        System.out.println("\nRecherche par nom :");
        System.out.println(
                gestion.rechercherDepartement("Informatique"));

        // Recherche par objet
        System.out.println("\nRecherche par objet :");
        System.out.println(gestion.rechercherDepartement(d1));

        // Suppression
        System.out.println("\nSuppression du departement Marketing :");
        gestion.supprimerDepartement(d4);
        gestion.afficherDepartements();

        // Tri naturel par id
        System.out.println("\nTri des departements par ID :");
        gestion.trierDepartementsParId();

        // Tri personnalise
        System.out.println("\nTri par nom et nombre d'employes :");
        gestion.trierDepartementsParNomEtNombreEmployes();

        // Test de equals et du HashSet
        System.out.println("\nTest de l'egalite des departements :");

        Departement d6 = new Departement(
                3, "Informatique", 50);

        System.out.println(d1.equals(d6));

        System.out.println("\nAjout d'un departement deja existant :");
        gestion.ajouterDepartement(d6);

        gestion.afficherDepartements();
    }
}