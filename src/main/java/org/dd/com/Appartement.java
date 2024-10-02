package org.dd.com;


import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Appartement {
    private String id;
    private String titre;
    private String description;
    private double loyer_mensuel;
    private AppartementStatus status;
    private Endroit endroit;

    public Appartement(String id, String titre, String description, double loyer_mensuel, AppartementStatus status) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.loyer_mensuel = loyer_mensuel;
        this.status = status;
        this.endroit = null;
    }
}
