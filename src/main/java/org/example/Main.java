package org.example;

public class Main {
    public static void main(String[] args) {
        abstractFactory x = new ModernFactory();
        x.chair().build();
        abstractFactory c= new classicFactory();
        c.Table().build();
    }
}