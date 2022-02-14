package com.lspoke.zoo;

public class Tiger extends Animal{
    public Tiger(String name, int age, String color) {
        super(name, age, color);
    }
    @Override
    public void voice() {
        System.out.println("I say RAAF");
    }
    @Override
    public void info() {
        System.out.print("I'm Tiger\t");
        super.info();
    }
}
