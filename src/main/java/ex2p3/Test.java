package ex2p3;
import java.util.Scanner;

import static ex2p3.Ex1.division;
import static ex2p3.Ex1.tableau;


public class Test {

    public static void main(String[] args) throws Lexception {

        Scanner sc = new Scanner(System.in);

        boolean recommencer = false;

        try {
            Calcul.functionCalculation();
        } catch (Lexception e) {
            System.out.println(e.getMessage());
            System.out.println("Voulez vous recommencer ? yes/no");
            recommencer = sc.nextLine().equals("yes");
            if (recommencer == true) {
                Calcul.functionCalculation();
            } else {
                System.exit(0);
            }

        }
    }

}
