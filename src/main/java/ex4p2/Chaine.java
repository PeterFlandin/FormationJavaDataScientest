package ex4p2;

public class Chaine {

    protected String nom;
    protected char polarité;
    protected float fréquence;


    public Chaine(String n, float f, char p) {
        nom = n;
        fréquence = f;
        polarité = p;
    }

    public String toString() {
        return "La chaîne : " + nom + "de fréquence :" + fréquence + " de polarité :" +polarité;
    }

}
