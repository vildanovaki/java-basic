package com.vildanova;

public class Cat extends HomePet {
    protected static double maxWeight = 10;
    protected static double minWeight = 0.2;
    protected static int maxDistanceOfWalk = 2;

    protected String[] colorOfCat = {"white", "black", "multicolored", "spotted"};

    protected Cat(String name, int age, double weight, double height, String color) {
        super(name, age, weight, height, color);
    }

    @Override
    protected void play(double min) {
        if (min <= 0) {
            System.out.println("Вес питомца не снизится!");
        }
        if (min > 0 && min < 10) {
            if (!(weight < minWeight)) {
                weight -= 0.05;
                System.out.println("Вес питомца снизится на 50 грамм!");
            } else {
                System.out.println("Не стоит играть с питомцом, так как его вес составляет!" +
                        (Double) Math.floor(weight * 100) / 100.0);
            }
        }
        if (min >= 10 && min <= 30) {
            if (!(weight < minWeight)) {
                weight -= 0.1;
                System.out.println("Вес питомца снизится на 100 грамм!");
            } else {
                System.out.println("Не стоит играть с питомцом, так как его вес составляет!" +
                        (Double) Math.floor(weight * 100) / 100.0);
            }
        }
        if (min > 30 && min <= 60) {
            if (!(weight < minWeight)) {
                weight -= 0.2;
                System.out.println("Вес питомца снизится на 200 грамм!");
            } else {
                System.out.println("Не стоит играть с питомцом, так как его вес составляет!" +
                        (Double) Math.floor(weight * 100) / 100.0);
            }
        }
        if (min > 60) {
            System.out.println("Не стоит играть с питомцом, больше 60 минут. Вес питомца составляет!" +
                    (Double) Math.floor(weight * 100) / 100.0);
        }
    }

    protected void walk(int distanceOfWalk) { // прогулка
        super.walk(distanceOfWalk);
        if (distanceOfWalk > maxDistanceOfWalk) {
            System.out.println("Кошка/кот пройдет максимальную положенную дистанцию!");
        }
    }

    @Override
    public void feed(double gramOfFood) {
        weight += gramOfFood;
        if (weight >= maxWeight) {
            System.out.println("Кошка/кот достигнет максимум веса - перевес");
        }
        System.out.println("Вес питомца составит " + weight + " грамм");
    }

    @Override
    public void giveWaterToDrink(double gramOfWater) {
        weight += gramOfWater;
        if (weight >= maxWeight) {
            System.out.println("Кошка/кот достигнет максимума веса - перевес");
        }
        System.out.println("Вес питомца составит " + weight + " килограмм");
    }

    protected void checkOfColor() {
        super.checkOfColor();
        int count = 0;
        for (int i = 0; i < colorOfCat.length; i++) {
            if (colorOfCat[i] == getColor()) {
                count += 1;
                System.out.println("Цвет питомца соответствует стандарту");
            }
        }
        if (count == 1) {
            System.out.println("Цвет питомца соответствует стандарту");
            count = 0;
        } else {
            System.out.println("Цвет питомца не соответствует стандарту. Чтобы узнать стандартный цвет питомца, " +
                    "необходимо вызвать метод viewColors");
        }
    }

    @Override
    protected void viewColors() {
        System.out.println("\nБаза с рацветками котов:");
        for (String color : colorOfCat) {
            System.out.println(color);
        }
    }

    @Override
    public void voice() {
        System.out.println("Мяу!");
    }

    public String toString() {
        System.out.println("Подробная информация о коте после проведенных действий:");
        return super.toString();
    }
}
