package org.example.concreteClasses;

import org.example.Interface.Spartan;

public class JavaSDET implements Spartan {
    @Override
    public String occupation() {
        return "Java SDET";
    }

    @Override
    public String description() {
        return "I test code in Java";
    }

    @Override
    public void salary() {
        System.out.println("I earn a lot of money");
    }

    @Override
    public String codingLanguage() {
        return "I code with Java";
    }
}
