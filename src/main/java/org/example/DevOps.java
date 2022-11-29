package org.example;

import Interface.Spartan;

public class DevOps implements Spartan {
    @Override
    public String occupation() {
        return "Dev Ops Engineer";
    }

    @Override
    public String description() {
        return "I deploy applications with automation";
    }

    @Override
    public void salary() {
        System.out.println("I earn a lot of money");
    }

    @Override
    public String codingLanguage() {
        return "I code in Python and use other technologies";
    }
}
