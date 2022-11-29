package org.example;

import Interface.Spartan;

public class CSharpSDET implements Spartan {
    @Override
    public String occupation() {
        return "C# SDET";
    }

    @Override
    public String description() {
        return "I test software in the C# language";
    }

    @Override
    public void salary() {
        System.out.println("I earn a lot of money");
    }

    @Override
    public String codingLanguage() {
        return "I code in the C# language";
    }
}
