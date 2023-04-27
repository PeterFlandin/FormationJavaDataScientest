package ex1p2;

import java.time.LocalDate;

public class ProduitAlimentaire  extends  Produit{

    private LocalDate dateFabrication;

    private LocalDate dateLimiteConsommation;

    private double poids;


    public ProduitAlimentaire(int code, String libelle, double prixHT, LocalDate dateFabrication, LocalDate dateLimiteConsommation, double poids) {
        super(code,libelle,prixHT);
        this.dateFabrication = dateFabrication;
        this.poids = poids;
        this.dateLimiteConsommation = dateLimiteConsommation;
    }


    public LocalDate getDateFabrication() {
        return dateFabrication;
    }

    public void setDateFabrication(LocalDate dateFabrication) {
        this.dateFabrication = dateFabrication;
    }

    public LocalDate getDateLimiteConsommation() {
        return dateLimiteConsommation;
    }

    public void setDateLimiteConsommation(LocalDate dateLimiteConsommation) {
        this.dateLimiteConsommation = dateLimiteConsommation;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public String toString(){
        return super.toString()  + " Dete limite de conso "+ dateLimiteConsommation + "Date de fabrication :"+ dateFabrication + " Poids : "+ poids;
    };


}
