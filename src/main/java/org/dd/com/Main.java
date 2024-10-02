package org.dd.com;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Appartement appart2 = new Appartement("app1", "famille", "famille", 50000, AppartementStatus.valueOf("libre"));
        Appartement appart1 = new Appartement("app1", "famille", "famille", 50000, AppartementStatus.valueOf("libre"));

        List<Appartement> appartements = new ArrayList<>();
        appartements.add(appart2);
        appartements.add(appart1);


        Immeuble Immeuble = new Immeuble("im1","Radisson", 6);
        Immeuble.setAppartements(appartements);
        List<Immeuble> immeubles = new ArrayList<>();
        immeubles.add(Immeuble);

        Quartier Quartier = new Quartier("q1", "Analamahitsy", immeubles);

        appart1.setEndroit_name(Immeuble.getNom());
        appart2.setEndroit_name(Immeuble.getNom());

        System.out.println(Quartier.compterAppartements());
        System.out.println(Immeuble.compterAppartements());
        System.out.println(Quartier.trouverAppartement(appart1));
        System.out.println(appartements);
    }
}