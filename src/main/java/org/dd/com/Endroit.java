package org.dd.com;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
@EqualsAndHashCode

public abstract class Endroit {
    private String id;
    private String nom;

    public abstract int compterAppartements();
}
