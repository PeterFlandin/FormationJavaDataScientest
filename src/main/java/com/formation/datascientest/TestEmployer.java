package com.formation.datascientest;

import com.formation.datascientest.debutPratique.entity.Employe;

public class TestEmployer
{

    public static void main(String[] args)
    {

        Employe thibaule = new Employe("thibaule", "chef", 1000 );

        thibaule.toString();

        thibaule.setSalaire(50000);
        thibaule.setNom("Jean");
        thibaule.setGrade("ouvrier");

        thibaule.toString();

        System.out.println(Employe.getNbEmployer());

    }

}
