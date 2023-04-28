package ex1p3;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);
            System.out.println("le nom du chien ?");
            String nom = sc.nextLine();

            System.out.println("le nombre de puce du chien?");
            int puce = sc.nextInt();
            sc.nextLine();

            Toutou chien = new Toutou(nom, puce);

            System.out.println(chien);

        } catch (IllegalArgumentException e) {
            System.out.println(e.message);
        }
        finally {
            System.out.println("fin du programme");
        }
    }
}
