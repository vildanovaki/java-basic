package com.vildanova;

public class Dog extends HomePet {

    protected static double maxWeight = 90;
    protected static double minWeight = 2;
    protected static int maxDistanceOfWalk = 10;

    protected String[] colorOfDog = {"white", "black", "multicolored", "spotted"};

    protected Dog(String name, int age, double weight, double height, String color) {
        super(name, age, weight, height, color);
    }

    @Override
    protected void play(double min) {
        if (min <= 0) {
            System.out.println("Вес питомца не снизится!");
        }
        if (min > 0 && min < 10) {
            if (!(weight < minWeight)) {
                weight -= 0.2;
                System.out.println("Вес питомца снизится на 200 грамм!");
            } else {
                System.out.println("Не стоит играть с питомцом, так как его вес составляет!" +
                        Math.floor(weight * 100) / 100.0);
            }
        }
        if (min >= 10 && min <= 30) {
            if (!(weight < minWeight)) {
                weight -= 0.5;
                System.out.println("Вес питомца снизится на 500 грамм!");
            } else {
                System.out.println("Не стоит играть с питомцом, так как его вес составляет!" +
                        Math.floor(weight * 100) / 100.0);
            }
        }
        if (min > 30 && min <= 60) {
            if (!(weight < minWeight)) {
                weight -= 0.8;
                System.out.println("Вес питомца снизится на 800 грамм!");
            } else {
                System.out.println("Не стоит играть с питомцом, так как его вес составляет!" +
                        Math.floor(weight * 100) / 100.0);
            }
        }
        if (min > 60) {
            System.out.println("Не стоит играть с питомцом, больше 60 минут. Вес питомца составляет: " +
                    Math.floor(weight * 100) / 100.0);
        }
    }

    protected void walk(int distanceOfWalk) {
        super.walk(distanceOfWalk);
        if (this.distanceOfWalk > maxDistanceOfWalk) {
            System.out.println("Собака пройдет максимальную положенную дистанцию!");
        }
    }

    @Override
    public void feed(double gramOfFood) {
        weight += gramOfFood;
        if (weight >= maxWeight) {
            System.out.println("Собака достигнет максимум веса - перевес");
        }
        System.out.println("Вес питомца составит " + weight + " грамм");
    }

    @Override
    public void giveWaterToDrink(double gramOfWater) {
        weight += gramOfWater;
        if (weight >= maxWeight) {
            System.out.println("Собака достигнет максимума веса - перевес");
        }
        System.out.println("Вес питомца составит " + weight + " грамм");
    }

    protected void checkOfColor() {
        super.checkOfColor();
        int count = 0;
        for (String s : colorOfDog) {
            if (s == getColor()) {
                count += 1;
                System.out.println("Цвет питомца соответствует стандарту");
            }
        }
        if (count == 1) {
            System.out.println("Цвет питомца соответствует стандарту");
        } else {
            System.out.println("Цвет питомца не соответствует стандарту. Чтобы узнать стандартный цвет питомца, " +
                    "необходимо вызвать метод viewColors");
        }
    }

    @Override
    protected void viewColors() {
        System.out.println("\nБаза с расцветками собак:");
        for (String color : colorOfDog) {
            System.out.println(color);
        }
    }

    @Override
    public void voice() {
        System.out.println("Гав-гав!");
    }

    public String toString() {
        System.out.println("Подробная информация о собаке после проведенных действий:");
        return super.toString();
    }
}
