package main;

import entities.Employe;
import entities.SocieteArrayList;

import java.util.List;

public class MainEmployes {

    public static void main(String[] args) {

        // Création de la société
        SocieteArrayList societe = new SocieteArrayList();

        // Création des employés
        Employe e1 = new Employe(3, "Ben Ali", "Ahmed", "Informatique", 2);
        Employe e2 = new Employe(1, "Trabelsi", "Sarra", "Finance", 3);
        Employe e3 = new Employe(5, "Mansouri", "Ali", "Informatique", 1);
        Employe e4 = new Employe(2, "Khalil", "Amira", "RH", 2);
        Employe e5 = new Employe(4, "Ben Salem", "Youssef", "Finance", 1);

        // Ajouter les employés
        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);
        societe.ajouterEmploye(e5);

        // Afficher les employés
        System.out.println("Liste des employés :");
        societe.displayEmploye();

        // Rechercher par nom
        System.out.println("\nRecherche par nom :");
        System.out.println(societe.rechercherEmploye("Ben Ali"));

        // Rechercher par objet
        System.out.println("\nRecherche par objet :");
        System.out.println(societe.rechercherEmploye(e1));

        // Supprimer un employé
        System.out.println("\nSuppression de l'employé :");
        societe.supprimerEmploye(e4);
        societe.displayEmploye();

        // Tri naturel par id
        System.out.println("\nTri par id :");
        societe.trierEmployeParId();
        societe.displayEmploye();

        // Tri personnalisé
        System.out.println("\nTri par département, grade et nom :");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();

        // Recherche avancée par département
        System.out.println("\nRecherche des employés du département Informatique :");

        List<Employe> resultat =
                societe.rechercherParDepartement("Informatique");

        for (int i = 0; i < resultat.size(); i++) {
            System.out.println(resultat.get(i));
        }
    }
}
