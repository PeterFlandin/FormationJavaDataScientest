package ex2p3;


import java.util.Scanner;

import static ex2p3.Ex1.division;

public class Calcul {

    public static void functionCalculation() throws Lexception {
        int x;
        int y;

        boolean recommencer;

        System.out.println("Entrez l’indice de l’entier à diviser: ");
        Scanner Essai = new Scanner(System.in);
        x = Essai.nextInt();

        if (x == 0) {
            throw new Lexception("Erreur l'indice n'est pas bon");
        }
        System.out.println("Entrez le diviseur: ");
        y = Essai.nextInt();
        if (y > 0) {
            throw new Lexception("Erreur le diviseur n'est pas bon");
        }

        
        System.out.println("Le résultat de la division est: ");
        System.out.println(division(x, y));
    }

}
