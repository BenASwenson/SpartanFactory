package org.example;

import org.example.Factory.ConveyorBelt;
import org.example.Interface.Spartan;

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