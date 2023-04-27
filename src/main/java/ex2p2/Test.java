package ex2p2;

public class Test {

    public static void main(String[] args) {

        Cercle cercle = new Cercle(20);
        Carre carre = new Carre(50);

        FormeGeometrique[] formTab;

         formTab = new FormeGeometrique[1];
         formTab[0] = cercle;

        FormeGeometrique[] formTab2;

        formTab2 = new FormeGeometrique[1];
        formTab2[0] = carre;


        for (FormeGeometrique form: formTab
             ) {
            System.out.println(form.getSuperficie());
        }

        for (FormeGeometrique form2: formTab2) {
            System.out.println(form2.getSuperficie());
        }

        }

    }

