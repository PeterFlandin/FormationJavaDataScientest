package com.formation.datascientest;

import com.formation.datascientest.debutPratique.entity.Employe;

public class TestEmployer
{

    public static void main(String[] args)
    {

        Employe thibaule = new Employe("thibaule", "chef", 1000 );


        Employe e = new Employe("jean", "dingo",2000);
        Employe b = new Employe("bebe", "django",3000);

        System.out.println(e.compareE(b));


        System.out.println(thibaule.toString());


        thibaule.setSalaire(50000);
        thibaule.setNom("Jean");
        thibaule.setGrade("ouvrier");

        thibaule.toString();

        System.out.println(Employe.getNbEmployer());

    }

}
