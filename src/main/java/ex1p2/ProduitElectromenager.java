package ex1p2;

public class ProduitElectromenager extends Produit{

     private char classeEnergetique;

     TypeEnergetique typeEnergetique;

    public ProduitElectromenager(int code, String libelle, double prixHT, char classeEnergetique, TypeEnergetique typeEnergetique) {
        super(code, libelle, prixHT);
        this.classeEnergetique = classeEnergetique;
        this.typeEnergetique  = typeEnergetique;

    }

    public char getClasseEnergetique() {
        return classeEnergetique;
    }

    public void setClasseEnergetique(char classeEnergetique) {
        this.classeEnergetique = classeEnergetique;
    }
    @Override
    public String toString() {
        return super.toString() + "Classe energetique :" + classeEnergetique + typeEnergetique.toString();
    }
    

}
