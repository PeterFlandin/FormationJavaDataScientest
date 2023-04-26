package ex1p2;

public class Produit {

    private int code;
    private String libelle;

    private double prixHT;

    public Produit(int code, String libelle, double prixHT) {
  this.code = code;
  this.libelle = libelle;
  this.prixHT = prixHT;
    }

    public Produit() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }


    public double getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(double prixHT) {
        this.prixHT = prixHT;
    }

    @Override
    public String toString() {
        return "Code :" +code+ "Libelle :" + libelle+ "PrixHT :" + prixHT;
    }
}
