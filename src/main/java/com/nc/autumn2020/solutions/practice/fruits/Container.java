package com.nc.autumn2020.solutions.practice.fruits;

import java.util.ArrayList;

public abstract class  Container {
    private int capacity;
    private int count;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getLimitWeight() {
        return limitWeight;
    }

    public void setLimitWeight(int limitWeight) {
        this.limitWeight = limitWeight;
    }

    private Fruit[] fruits = new Fruit[capacity];
    private int limitWeight;

    public Fruit[] getFruits() {
        return fruits;
    }

    public void setFruits(Fruit[] fruits) {
        this.fruits = fruits;
    }

    public void putFruit(Fruit fruit){
        if (count < capacity ){
            int sumWeight = 0;
            for (int i = 0; i < count; i++){
                sumWeight+=this.getFruits()[i].getWeight();
            }
            if(sumWeight < limitWeight){
                Fruit[] newArray = new Fruit[capacity];
                newArray[0] = fruit;
                for (int i = 1; i <= count; i++){
                    newArray[i] = this.getFruits()[i - 1];
                }
                this.setFruits(newArray);
                count++;
            }
        }
        else System.out.println("В контейнер больше не влезет!");
    }

    public Fruit getFruit(){
        if(count > 0) {
            Fruit fruit = this.getFruits()[0];
            Fruit[] newArray = new Fruit[count];
            for (int i = 1; i < count; i++) {
                newArray[i - 1] = this.getFruits()[i];
            }
            this.setFruits(newArray);
            count--;
            return fruit;
        }
        else{
            return null;
        }
    }
}
