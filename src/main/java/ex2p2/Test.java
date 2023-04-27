package ex2p2;

public class Test {

    public static void main(String[] args) {


        FormeGeometrique[] ge = {new Carre(50), new Carre(50), new Cercle(20), new Cercle(20)};

        Carre tab1[] = new Carre[2];
        Cercle tab2[] = new Cercle[2];

int carre = 0;
int cercle = 0;

        for (int i = 0; i < ge.length; i++) {
            if (ge[i] instanceof Carre) {
                tab1[carre] = (Carre) ge[i];
                System.out.println(tab1[carre]);
                carre++;

            } else {
                tab2[cercle] = (Cercle) ge[i];
                System.out.println(tab2[cercle]);
                cercle++;

            }
        }
    }
}