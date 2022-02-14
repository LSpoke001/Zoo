package com.lspoke.zoo;

public class Zebra extends Animal{
    public Zebra(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void voice() {
        System.out.println("I say UEGOGO");
    }
    @Override
    public void info() {
        System.out.print("I'm Zebra\t");
        super.info();
    }
}
