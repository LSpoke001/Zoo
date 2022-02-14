package com.lspoke.zoo;

public class Hippopotamus extends Animal{
    public Hippopotamus(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void voice() {
        System.out.println("I say Ufff");
    }
    @Override
    public void info() {
        System.out.print("I'm Hippopotamus\t");
        super.info();
    }
}
