package exercice;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ex05 {

        public static void main(String[] args) {

            int num =0;
            int tableau[] = new int[5];

            randomTab(tableau);

            triage(tableau);

            inserInt(tableau, num);
        }

        public static void randomTab(int tableau[]) {
            for(int i = 0; i < tableau.length ; i++) {
                Random rand = new Random();
                int t = rand.nextInt(100);
                tableau[i] = t;
                System.out.println(tableau[i]);
            }
        }


        public static void affichage(int tableau[]){
            for (int i = 0; i<tableau.length; i++) {
                System.out.println(tableau[i]);
            }
        }

        public static void triage(int tableau[]){
            Arrays.sort(tableau);
            System.out.println(Arrays.toString(tableau));
        }

        public static void inserInt(int tableau[], int num ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("entre votre numero");
            num = sc.nextInt();
            int chiffre = Arrays.binarySearch(tableau, num);
            if(chiffre == num) {
                System.out.println("c'est good");
            } else {
                System.out.println("pas good");
            }
        }
    }





