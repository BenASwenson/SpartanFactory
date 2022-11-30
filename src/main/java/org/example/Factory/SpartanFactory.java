package org.example.Factory;

import org.example.Interface.Spartan;

public abstract class SpartanFactory {

    public Spartan makeSpartan(String type) {
        Spartan spartan = createSpartan(type);
        spartan.codingLanguage();
        spartan.description();
        spartan.occupation();
        spartan.salary();
        return spartan;

    }



    public abstract Spartan createSpartan(String type);

}
