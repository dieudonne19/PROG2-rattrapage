package org.dd.com;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
@EqualsAndHashCode

public class Appartement {
    private String id;
    private String titre;
    private String description;
    private double loyer_mensuel;
    private AppartementStatus status;
    private Endroit endroit;
}
