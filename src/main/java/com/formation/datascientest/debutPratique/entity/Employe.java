package com.formation.datascientest.debutPratique.entity;

public class Employe {

    private static int nbEmployer;
    private String nom;



    private String grade;

    private float salaire;

    public Employe() {
        nbEmployer++;
    }

    public Employe(String nom, String grade, float salaire) {
        nbEmployer++;
        this.nom = nom;
        this.grade = grade;
        this.salaire = salaire;
    }
    public static int getNbEmployer() {
        return nbEmployer;
    }

    public static void setNbEmployer(int nbEmployer) {
        Employe.nbEmployer = nbEmployer;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public float getSalaire() {
        return salaire;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }
    @Override
    public String toString() {
        return ("Nom :"+getNom()+ "Grade : " + getGrade() +"Salaire :"+ getSalaire());
    }

}



