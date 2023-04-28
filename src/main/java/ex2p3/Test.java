package ex2p3;
import java.util.Scanner;

import static ex2p3.Ex1.division;
import static ex2p3.Ex1.tableau;


public class Test {

    public static void main(String[] args) throws Lexception {

        try {
           Calcul.functionCalculation() ;
        } catch (Lexception e) {
            System.out.println(e.getMessage());
        }
    }

}
