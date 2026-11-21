package entities;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DepartementHashSet implements IDepartement<Departement> {

    private HashSet<Departement> departements;

    // Constructeur
    public DepartementHashSet() {
        departements = new HashSet<Departement>();
    }

    // Ajouter un departement
    @Override
    public void ajouterDepartement(Departement d) {
        departements.add(d);
    }

    // Rechercher par nom
    @Override
    public boolean rechercherDepartement(String nomDepartement) {
        for (Departement d : departements) {
            if (d.getNomDepartement().equals(nomDepartement)) {
                return true;
            }
        }

        return false;
    }

    // Rechercher par objet
    @Override
    public boolean rechercherDepartement(Departement d) {
        return departements.contains(d);
    }

    // Supprimer un departement
    @Override
    public void supprimerDepartement(Departement d) {
        departements.remove(d);
    }

    // Afficher les departements
    @Override
    public void afficherDepartements() {
        for (Departement d : departements) {
            System.out.println(d);
        }
    }

    // Tri naturel par id
    @Override
    public void trierDepartementsParId() {
        List<Departement> liste = new ArrayList<Departement>(departements);

        Collections.sort(liste);

        for (Departement d : liste) {
            System.out.println(d);
        }
    }

    // Tri personnalise par nom puis nombre d'employes
    @Override
    public void trierDepartementsParNomEtNombreEmployes() {
        List<Departement> liste = new ArrayList<Departement>(departements);

        Collections.sort(liste, new Comparator<Departement>() {
            @Override
            public int compare(Departement d1, Departement d2) {

                int resultat = d1.getNomDepartement()
                        .compareTo(d2.getNomDepartement());

                if (resultat == 0) {
                    resultat = d1.getNombreEmployes()
                            - d2.getNombreEmployes();
                }

                return resultat;
            }
        });

        for (Departement d : liste) {
            System.out.println(d);
        }
    }
}