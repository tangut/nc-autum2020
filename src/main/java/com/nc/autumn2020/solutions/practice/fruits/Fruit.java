package com.nc.autumn2020.solutions.practice.fruits;

public class Fruit {
     private String name;
     // вес будем задавать в граммах
    private int weight;
    private int calory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fruit(int weight, int calory, String name){
        this.setCalory(calory);
        this.setWeight(weight);
        this.setName(name);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCalory() {
        return calory;
    }

    public void setCalory(int calory) {
        this.calory = calory;
    }
}
