package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

import java.util.Objects;

public class Technicien extends Employe {
    private Integer grade;

    public Technicien() {
    }

    public Technicien(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire, Integer grade) {
        super(nom, prenom, matricule, dateEmbauche, salaire);
        this.grade = grade;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
    @Override
    public void setSalaire(Double salaire) {
        if (salaire != null && grade != 0) {
        super.setSalaire(salaire + salaire * grade / 10);
        }
    }
    @Override
    public Integer getNbConges() {
        return Entreprise.NB_CONGES_BASE + getNombreAnneeAnciennete();
    }
    @Override
    public Double getPrimeAnnuelle(){
        return Entreprise.primeAnnuelleBase() + Entreprise.primeAnnuelleBase() * grade / 10 + Entreprise.PRIME_ANCIENNETE * getNombreAnneeAnciennete();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Technicien that = (Technicien) o;
        return Objects.equals(grade, that.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), grade);
    }
}
