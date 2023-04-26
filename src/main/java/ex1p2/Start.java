package ex1p2;

import java.time.LocalDate;

import ex1p2.TypeEnergetique;

import ex1p2.TypeEnergetique;

public class Start {
    public static void main(String[] args) {

        ProduitAlimentaire[] produitAlimentaires = new ProduitAlimentaire[1];
        produitAlimentaires[0] = new ProduitAlimentaire(10, "chupachups",10.20, LocalDate.of(25,02,20),LocalDate.of(12,12,26), 56 );


        ProduitElectromenager[] produitElectromenagers = new ProduitElectromenager[1];
        produitElectromenagers[0] = new ProduitElectromenager(1,"machine",22,'e',TypeEnergetique.Econome);


        System.out.println(produitElectromenagers[0].toString());
        System.out.println(produitAlimentaires[0].toString());


    }
}
