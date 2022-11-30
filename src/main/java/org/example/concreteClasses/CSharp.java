package org.example.concreteClasses;

import org.example.Interface.Spartan;

public class CSharp implements Spartan {
    @Override
    public String occupation() {
        return "C# Developer";
    }

    @Override
    public String description() {
        return "I develop applications with C#";
    }

    @Override
    public void salary() {
        System.out.println("I earn a lot of money");
    }

    @Override
    public String codingLanguage() {
        return "I code with C#";
    }
}
