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

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected double getWeight() {
        return weight;
    }

    protected void setWeight(double weight) {
        this.weight = weight;
    }

    protected double getHeight() {
        return height;
    }

    protected void setHeight(double height) {
        this.height = height;
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
                "Рост:" + getHeight() + "\n" + "Вес:" + getWeight() + "\n";
    }
}
