package ex2p3;

import java.util.Scanner;

public class Ex1  {

    static int[] tableau = {17, 12, 15, 38, 29, 157, 89, -22, 0, 5};

    static int division(int indice, int diviseur) {

        if (diviseur == 0) {
            throw new ArithmeticException("Erreur le diviseur n'est pas bon");
        }
        if (indice < 0) {
            throw new  ArrayIndexOutOfBoundsException("Erreur l'indice n'est pas bon");
        }


        return tableau[indice] / diviseur;
    }




}