package com.lspoke.zoo;

/*
1) Давайте создадим класс зоопарк.
В этом классе должен храниться массив с различными животными.
Должен быть метод для поиска животного по имени.
Должен быть метод для распечатывания информации по всем имеющимся животным.
Пусть у зоопарка также будет два метода: удалить или добавить новое животное.

2) Должен быть класс животное, от него должны быть унаследованы животные на ваш выбор,
этот класс должен быть их предком. В классе зоопарк должен храниться массив с животными.
У каждого животного должен быть реализован метод – поздороваться.
И у зоопарка тоже должен быть аналогичный метод, который бы
проходился по массиву животных и у каждого просил поздороваться.
 */

public class Zoo {
    public static void main(String[] args) {
        ZooManagement zoo = new ZooManagement();

        Animal donkey = new Donkey("Ia", 4, "gray");
        Animal giraffe = new Giraffe("Melman", 2, "Yellow");
        Animal hippopotamus = new Hippopotamus("Gloria", 5, "grey");
        Animal tiger = new Tiger("Alex", 3, "orange with black stripes");
        Animal zebra = new Zebra("Marty", 3, "white with black stripes");

        zoo.addAnimal(donkey);
        zoo.addAnimal(giraffe);
        zoo.addAnimal(hippopotamus);
        zoo.addAnimal(tiger);
        zoo.addAnimal(zebra);

        System.out.println("All animals");
        zoo.allAnimals();

        System.out.println("Find Alex and Marty");
        zoo.findAnimal("Alex");
        zoo.findAnimal("Marty");

        System.out.println("Remove hippopotamus and zebra");
        zoo.removeAnimal(hippopotamus);
        zoo.removeAnimal(zebra);

        System.out.println("All animals");
        zoo.allAnimals();

        System.out.println("Remove all");
        zoo.removeAllAnimals();

        zoo.allAnimals();
    }
}
