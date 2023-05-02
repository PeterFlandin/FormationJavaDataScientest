package ex2p3;
import java.util.Scanner;

import static ex2p3.Ex1.*;


public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;
        int y;

        try {
            boolean recommencer = true;
            System.out.println("Entrez l’indice de l’entier à diviser: ");
            Scanner Essai = new Scanner(System.in);
            x = Essai.nextInt();
            System.out.println("Entrez le diviseur: ");
            y = Essai.nextInt();
            System.out.println("Le résultat de la division est: ");
            System.out.println(division(x, y));
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Voulez vous recommencer ? yes/no");
            boolean recommencer = sc.nextLine().equals("yes");
            if (recommencer) {
                main(args);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("Voulez vous recommencer ? yes/no");
            boolean recommencer = sc.nextLine().equals("yes");
            if (recommencer) {
                main(args);
            }


        }

    }
}

