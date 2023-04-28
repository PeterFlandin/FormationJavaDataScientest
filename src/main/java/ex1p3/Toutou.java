package ex1p3;

public class Toutou {

    private String nom;
    private int nombrePuce;

    public Toutou(String nom, int nombrePuce) throws IllegalArgumentException {

        if ( nom != "" ) {
            this.nom = nom;
        } else {
            throw new IllegalArgumentException("Le nom du toutou ne peut pas être nul");
        }

        if (nombrePuce >= 0) {
            this.nombrePuce = nombrePuce;
        } else {
            throw new IllegalArgumentException("Nombre de puce ne peut pas être négatif");
        }

    }
}
