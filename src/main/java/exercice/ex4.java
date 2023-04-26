package exercice;

public class ex4 {

        public static void main(String[] args) {

            int t[][] = { { 1, 2, 3 }, { 11, 12 }, { 21, 22, 23, 24 } };
            //	System.out.println("====> t avant raz : ");
            //affiche(t);
            //	raz(t);
            //	System.out.println("====> t apres raz : ");
            //affiche(t);

        }

        public static void affichage(int t[][]){
            for (int i = 0; i<t.length; i++) {
                System.out.println(t[i]);
                for(int j = 0; j < t[i].length; j++) {
                    System.out.println(t[i][j]);
                }

            }
        }

        public static void raz(int t[][]){
            for (int i = 0; i<t.length; i++) {
                for(int j = 0; j < t[i].length; j++) {
                    t[i][j]=0;
                }

            }
        }

    }

