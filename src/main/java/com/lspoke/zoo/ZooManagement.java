package com.lspoke.zoo;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;

public class ZooManagement {
    ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    public void removeAnimal(Animal animal){
        animals.remove(animal);
    }
    public void findAnimal(String name){
        for (Animal animal: animals) {
            if(animal.getName().equals(name)){
                System.out.print("FIND! ");
                animal.info();
            }
        }
    }
    public void allAnimals(){
        if(!animals.isEmpty()){
            for(Animal animal: animals){
                animal.info();
            }
        }else{
            System.out.println("I don't have animals");
        }
    }

    public void removeAllAnimals(){
        animals.clear();
    }
}
