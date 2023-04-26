package edu.formation.packagea;

import edu.formation.packageb.ClasseB;

public class ClasseA {
    public static void methodeA(){
        System.out.println("hello package");
        ClasseB.methodeB();
    }

    public enum Mois{
        janvier("janvier", 31), fevrier("fevrier", 28), mars("mars", 1000),avril("avril", 5000);

        String mois;
        int nnbJours;
        Mois (String mois, int nnbJours) {
            this.mois = mois;
            this.nnbJours=nnbJours;
        }

    }

}
