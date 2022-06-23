package com.vildanova;

public abstract class HomePet implements Weight {

    protected double distanceOfWalk = 0;

    String name;
    int age;
    double weight;
    double height;
    String color;

    protected HomePet(String name, int age, double weight, double height, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.color = color;
    }

    private String getName() {
        return name;
    }

    private int getAge() {
        return age;
    }

    private double getWeight() {
        return weight;
    }

    private double getHeight() {
        return height;
    }

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected abstract void play(double min);

    protected void walk(int distanceOfWalk) {
        this.distanceOfWalk += distanceOfWalk;
        System.out.println("Запланированнная дистаниция прогулки составляет: " + this.distanceOfWalk + " км");
    }

    protected void checkOfColor() {
        System.out.println("Расцветка питомца - " + getColor());
    }

    abstract protected void viewColors();

    protected void voice() {

        System.out.println("Голос!");
    }

    public String toString() {
        return "Кличка: " + getName() + "\n" + "Возраст:" + getAge() + "\n" + "Расцветка:" + getColor() + "\n" +
                "Рост:" + getHeight() + "\n" + "Вес:" + (Double) Math.floor(getWeight() * 100) / 100.0 + "\n";
    }
}
