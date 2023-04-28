package important;

import java.util.Vector;

public class TestVector {
    public static void main(String[] args) {
        Vector vec = new Vector();
        for (int i = 0; i < 10; i++) {
            Integer element = new Integer(i);
            vec.addElement(element);// Ajout en fin de Vecteur
        } // => 0 1 2 3 4 5 6 7 8 9

        String i = "JAVA";
        vec.insertElementAt(i, 5);
        // Insertion à la position indiquée
        // => 0 1 2 3 4 JAVA 5 6 7 8 9
        String j = (String) vec.elementAt(5);
        System.out.println(" élément de la position 5 :" + j);
        vec.removeElementAt(0);
        // Suppression de l'élément indiqué
        // => 1 2 3 4 JAVA 5 6 7 8 9
        Integer k = (Integer) vec.elementAt(5);
        System.out.println(" élément de la position 5 :" + k);
        // k contient une référence sur l'objet contenant 5
        // vec.removeAllElements();
        // Suppression de tous les éléments
    } // fin main()
}// fin classe
