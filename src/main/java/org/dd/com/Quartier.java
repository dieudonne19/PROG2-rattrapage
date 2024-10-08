package org.dd.com;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@ToString
@EqualsAndHashCode

public class Quartier extends Endroit {
    private List<Immeuble> immeubles;

    public Quartier(String id, String nom, List<Immeuble>immeubles) {
        super(id, nom);
        this.immeubles = immeubles;
    }


    public Appartement trouverAppartement(Appartement appartement) {
        List<Appartement> appartements = new ArrayList<>();
        List<Immeuble> immeublesDansQuartier = new ArrayList<>();
        for (Immeuble i : immeubles) {
            for (Appartement a : i.getAppartements()){
                if (a == appartement) {
                    appartements.add(a);
                    // break;
                }
            }
        }
        return appartements.getFirst();
    }

    @Override
    public int compterAppartements() {
        int nombreAppartements = 0;
        for (Immeuble i : this.immeubles) {
            nombreAppartements += i.getAppartements().size();
        }
        return nombreAppartements;
    }
}
