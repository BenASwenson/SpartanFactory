package org.example.concreteClasses;

import org.example.Interface.Spartan;

public class JavaDev implements Spartan {
    @Override
    public String occupation() {

        return "Java Developer";
    }

    @Override
    public String description() {

        return "tests in Java.";
    }

    @Override
    public void salary() {
        System.out.println("I earn a lot of money");
    }

    @Override
    public String codingLanguage() {

        return "I code in the Java language";
    }
}
