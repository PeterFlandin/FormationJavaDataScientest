package ex3p2;

public class Personne implements Mesurable{

    private int taille;

    public Personne(int taille ) {
        this.taille = taille;
    }


    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    @Override
    public double getMesure() {
        return taille;
    }
}
