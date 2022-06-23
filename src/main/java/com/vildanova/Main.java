package com.vildanova;

public class Main {
    public static void main(String[] args) {
        HomePet dog = new Dog("Bob", 2, 2.5, 45, "white");
        dog.setColor("total white");
        dog.feed(0.5);
        dog.giveWaterToDrink(0.3);
        dog.walk(2);
        dog.walk(9);
        dog.play(50);
        dog.feed(0.2);
        dog.play(60);
        dog.play(80);
        dog.voice();
        System.out.println(dog);

        HomePet cat = new Cat("Katy", 1, 8, 15, "not black");
        cat.play(0);
        cat.giveWaterToDrink(2);
        cat.checkOfColor();
        cat.viewColors();
        cat.voice();
        System.out.println(cat);
    }
}
