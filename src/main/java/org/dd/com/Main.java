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


        Immeuble Immeubles = new Immeuble("im1","Radisson", 6);
        Immeubles.setAppartements(appartements);
        List<Immeuble> immeubles = new ArrayList<>();
        immeubles.add(Immeubles);

        Quartier Quartier = new Quartier("q1", "Analamahitsy", immeubles);


        System.out.println(Quartier.compterAppartements());
        System.out.println(Immeubles.compterAppartements());
    }
}