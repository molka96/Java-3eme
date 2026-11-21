package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>,
        IRechercheAvancee<Employe> {

    private ArrayList<Employe> employes;

    // Constructeur
    public SocieteArrayList() {
        employes = new ArrayList<Employe>();
    }

    // Ajouter un employe
    @Override
    public void ajouterEmploye(Employe e) {
        employes.add(e);
    }

    // Rechercher un employe par son nom
    @Override
    public boolean rechercherEmploye(String nom) {
        for (int i = 0; i < employes.size(); i++) {
            if (employes.get(i).getNom().equals(nom)) {
                return true;
            }
        }

        return false;
    }

    // Rechercher un employe par son identifiant
    @Override
    public boolean rechercherEmploye(Employe e) {
        for (int i = 0; i < employes.size(); i++) {
            if (employes.get(i).getId() == e.getId()) {
                return true;
            }
        }

        return false;
    }

    // Supprimer un employe
    @Override
    public void supprimerEmploye(Employe e) {
        for (int i = 0; i < employes.size(); i++) {
            if (employes.get(i).getId() == e.getId()) {
                employes.remove(i);
                return;
            }
        }
    }

    // Afficher les employes
    @Override
    public void displayEmploye() {
        for (int i = 0; i < employes.size(); i++) {
            System.out.println(employes.get(i));
        }
    }

    // Tri naturel par id avec Comparable
    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
    }

    // Tri personnalisé par département, grade puis nom
    @Override
    public void trierEmployeParNomDepartementEtGrade() {

        Collections.sort(employes, new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {

                int resultat = e1.getNomDepartement()
                        .compareTo(e2.getNomDepartement());

                if (resultat == 0) {
                    resultat = e1.getGrade() - e2.getGrade();
                }

                if (resultat == 0) {
                    resultat = e1.getNom().compareTo(e2.getNom());
                }

                return resultat;
            }
        });
    }

    // Recherche avancee par département
    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {

        List<Employe> resultat = new ArrayList<Employe>();

        for (int i = 0; i < employes.size(); i++) {
            if (employes.get(i).getNomDepartement()
                    .equals(nomDepartement)) {
                resultat.add(employes.get(i));
            }
        }

        return resultat;
    }
}
