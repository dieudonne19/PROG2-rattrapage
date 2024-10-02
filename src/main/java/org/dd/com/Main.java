package org.dd.com;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Appartement apprt2 = new Appartement("app1", "famille", "famille", 50000, AppartementStatus.valueOf("libre"));
        Appartement appart1 = new Appartement("app1", "famille", "famille", 50000, AppartementStatus.valueOf("libre"));

        List<Appartement> appartements = new ArrayList<>();
        appartements.add(apprt2);
        appartements.add(appart1);

        Immeuble Immeubles = new Immeuble("im1","Radisson", 6, appartements);
        List<Immeuble> immeubles = new ArrayList<>();


        Quartier Quartier = new Quartier("q1", "Analamahitsy", immeubles);


        int nombreAppart = Quartier.compterAppartements();
        System.out.println(appart1);

        Appartement app = Quartier.trouverAppartement(appart1);
        // System.out.println(app);
    }
}