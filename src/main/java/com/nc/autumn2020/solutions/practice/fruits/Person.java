package com.nc.autumn2020.solutions.practice.fruits;

public class Person {

    private String preference; // предпочтение, название фрукта, который хочет съесть человек
    private int countCalory;

    public int getCountCalory() {
        return countCalory;
    }

    public void setCountCalory(int countCalory) {
        this.countCalory = countCalory;
    }

    public Person(String preference){
        this.setPreference(preference);
    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }

    public void eatFruit(Container container){
        Fruit fruit = container.getFruit();
        if(fruit == null){
            System.out.println("Контейнер то пустой!");
        }
        else{
            if(fruit.getName().equals(this.getPreference())) {
                countCalory+=fruit.getCalory();
                System.out.println("Я скушал " + countCalory + " калорий");
            }
            else{
                System.out.println("Я не хочу это есть, выкину в мусорку!");
            }
        }
    }
}
