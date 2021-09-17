package com.ipiecoles.java.java220;

public class Main {
    public static void main(String[] args) {

        Employe employe1 = new Employe();
        employe1.setPrenom("John");
        employe1.setNom("Doe");

        Employe employe2 = new Employe();
        employe2.setPrenom("John");
        employe2.setNom("Doe");
        if(employe1.equals(employe2)){
            System.out.println("Employés égaux");
        } else {
            System.out.println("Employés différents !");
        }

        String chaine1 = new String("Coucou");
        String chaine2 = new String("Coucou");
        if(chaine1.equals(chaine2)){
            System.out.println("Chaînes égales");
        } else {
            System.out.println("Chaînes différentes !");
        }



        Integer integer1 = 128;//-127 et 127
        Integer integer2 = 128;
        if(integer1.equals(integer2)){
            System.out.println("Entiers égaux");
        } else {
            System.out.println("Entiers différents !");
        }

    }
}
