package com.lspoke.zoo;

public class Donkey extends Animal{
    public Donkey(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void voice() {
        System.out.println("I say Iaaa");
    }

    @Override
    public void info() {
        System.out.print("I'm Donkey\t");
        super.info();
    }
}
