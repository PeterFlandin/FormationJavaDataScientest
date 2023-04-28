package ex2p2;

import java.util.Vector;

public class Test {

    public static void main(String[] args) {

        FormeGeometrique[] ge = {new Carre(50), new Carre(50), new Cercle(20), new Cercle(20), new Carre(50), new Cercle(20), new Cercle(20)};

        Vector careeVec = new Vector();
        Vector cercleVec = new Vector();

        for (int i = 0; i < ge.length; i++) {
            if (ge[i] instanceof Carre) {
               careeVec.add(ge[i]);
            } else {
                cercleVec.add(ge[i]);
            }
        }
        System.out.println(cercleVec);
        System.out.println(careeVec);
    }
}