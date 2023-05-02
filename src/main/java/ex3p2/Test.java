package ex3p2;

public class Test {


    public static void main(String[] args){

        Cercle cercle = new Cercle(20) ;
        Personne personne = new Personne(20) ;

        System.out.println(cercle.getMesure());
        System.out.println(personne.getMesure());

        }
    public static void affiche(Mesurable mesurable) {
        System.out.println(mesurable.getMesure());
    }
    }

