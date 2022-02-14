package com.lspoke.zoo;

public class Giraffe extends Animal{
    public Giraffe(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void info() {
        System.out.print("I'm Giraffe\t");
        super.info();
    }
}
