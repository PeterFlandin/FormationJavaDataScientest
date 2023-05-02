package ex1p2;

import java.time.LocalDate;
import java.util.ArrayList;


public class Start {
    public static void main(String[] args) {

        ProduitElectromenager[] electromenager;
        ProduitAlimentaire[] alimentaires;

        alimentaires    =   new ProduitAlimentaire[3];
        alimentaires[0] =   new ProduitAlimentaire(10, "chupachups",10.20, LocalDate.of(25,02,20),LocalDate.of(12,12,26), 56 );
        alimentaires[1] =   new ProduitAlimentaire(10, "chipioios",10.4, LocalDate.of(25,02,20),LocalDate.of(12,12,26), 56 );
        alimentaires[2] =   new ProduitAlimentaire(10, "chipioios",10.4, LocalDate.of(25,02,20),LocalDate.of(12,12,26), 56 );

        electromenager    = new ProduitElectromenager[1];
        electromenager[0] = new ProduitElectromenager(1,"machine",22,'e',TypeEnergetique.Econome);


        for (ProduitAlimentaire itema: alimentaires) { System.out.println(itema.toString());};

        for (ProduitElectromenager iteme: electromenager) { iteme.toString();}

        ProduitElectromenager p1 = new ProduitElectromenager(1,"machine",22,'e',TypeEnergetique.Econome );

        ProduitAlimentaire p2 = new ProduitAlimentaire(10, "chupachups",10.20, LocalDate.of(25,02,20),LocalDate.of(12,12,26), 56);


        System.out.println(p2.equals(p2));

        System.out.println(p1.equals(p2));


        }
    }

