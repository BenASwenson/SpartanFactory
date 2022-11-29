package org.example;

import Interface.Spartan;

public class DataEngineer implements Spartan {
    @Override
    public String occupation() {
        return "Data Engineer";
    }

    @Override
    public String description() {
        return "I develop pipelines for data to be stored in";
    }

    @Override
    public void salary() {
        System.out.println("I earn a lot of money");
    }

    @Override
    public String codingLanguage() {
        return "I code in the Python and SQL languages";
    }
}
