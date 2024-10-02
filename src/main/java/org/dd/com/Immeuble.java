package org.dd.com;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
@Getter
@Setter
@EqualsAndHashCode

public class Immeuble extends Endroit {
    private int etages;
    private List<Appartement> appartements;

    public Immeuble(String id, String nom, int etages) {
        super(id, nom);
        this.etages = etages;
        this.appartements = new ArrayList<>();
    }

    @Override
    public int compterAppartements() {
        int nombreAppartements = 0;
        for (Appartement a : this.appartements) {
            if (a != null) {
                nombreAppartements++;
            }
        }
        return nombreAppartements;
    }
}
