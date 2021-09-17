package com.ipiecoles.java.java220;

import java.util.HashSet;
import java.util.Objects;

public class Manager extends Employe{
    private HashSet<Technicien> equipe = new HashSet<>();

    public HashSet<Technicien> getEquipe() {
        return equipe;
    }

    public void setEquipe(HashSet<Technicien> equipe) {
        this.equipe = equipe;
    }
    public void ajoutTechnicienEquipe(Technicien technicien) {
        equipe.add(technicien);
    }

    @Override
    public void setSalaire(Double salaire) {
        super.setSalaire(salaire * Entreprise.INDICE_MANAGER + salaire * (0.1 * equipe.size()));
    }

    @Override
    public Double getPrimeAnnuelle() {
        return Entreprise.primeAnnuelleBase() + Entreprise.PRIME_MANAGER_PAR_TECHNICIEN * equipe.size();
    }
    public void augmenterSalaireEquipe(Double pourcentage) {
        for (Technicien technicien: equipe) {
            technicien.augmenterSalaire(pourcentage) ;
        }
    }
    @Override
    public void augmenterSalaire(Double pourcentage) {
        augmenterSalaireEquipe(pourcentage);
        super.augmenterSalaire(pourcentage);
    }



}
