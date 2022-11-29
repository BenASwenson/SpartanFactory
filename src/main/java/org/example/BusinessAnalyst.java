package org.example;

import Interface.Spartan;

public class BusinessAnalyst implements Spartan {
    @Override
    public String occupation() {
        return "Business Analyst";
    }

    @Override
    public String description() {
        return "I analyse business matters";
    }

    @Override
    public void salary() {
        System.out.println("I earn a lot of money");
    }

    @Override
    public String codingLanguage() {
        return "I do not code";
    }
}
