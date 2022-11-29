package org.example;

import Interface.ConveyorBelt;
import Interface.Spartan;
import Interface.SpartanFactory;

public class Main {
    public static void main(String[] args) {

        ConveyorBelt conveyorBelt = new ConveyorBelt();
        Spartan spartan = conveyorBelt.createSpartan("BusinessAnalyst");
        spartan.salary();
        System.out.println(spartan.occupation());
        System.out.println(spartan.description());
        System.out.println(spartan.codingLanguage());


    }
}