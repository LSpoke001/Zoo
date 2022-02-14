package com.lspoke.zoo;

public abstract class Animal {
    protected String name;
    protected int age;
    protected String color;

    public String getName() {
        return name;
    }

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void info()
    {
        System.out.println("My name " + name +" i'm " + age + " years ago and my color is " + color);
    }
    public void voice(){
        System.out.println("I can't say nothing");
    }
}
