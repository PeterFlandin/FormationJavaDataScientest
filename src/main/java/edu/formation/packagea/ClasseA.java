package edu.formation.packagea;

import edu.formation.packageb.ClasseB;

public class ClasseA {
    public static void methodeA() {
        System.out.println("hello package");
        ClasseB.methodeB();
    }

    public enum Mois{
        janvier("janvier", 31), fevrier("fevrier", 28), mars("mars", 1000),avril("avril", 5000);


        private String mois;
        private int nnbJours;

        private Mois(String mois, int nnbJours) {
            this.mois = mois;
            this.nnbJours=nnbJours;
        }

        public String getMois() {
            return mois;
        }

        public void setMois(String mois) {
            this.mois = mois;
        }

        public int getNnbJours() {
            return nnbJours;
        }

        public void setNnbJours(int nnbJours) {
            this.nnbJours = nnbJours;
        }
        @Override
        public String toString() {
            return "FRENCH NAME" + mois + nnbJours;
        }

    }


}
