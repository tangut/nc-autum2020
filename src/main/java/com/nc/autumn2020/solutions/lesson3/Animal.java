package com.nc.autumn2020.solutions.lesson3;

public class Animal {

    //обязательные
    private String name; // имя животного
    private int id; // его id
    //необязательные
    private short age; // возраст животного
    private String kind; // вид животного
    private String sound; // звук которое оно издает
    private String color; // цвет животного

    public Animal(Builder builder){
        this.name = builder.name;
        this.id = builder.id;
        this.age = builder.age;
        this.kind = builder.kind;
        this.sound = builder.sound;
        this.color = builder.color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //выводит поля животного в консоль
    public void printAnimal(){
        System.out.println("Кличка: " + this.getName() + " "  + "id: "+ this.getId() + " "  + "вид: " + this.getKind() + " "
                + "его звук: " + this.getSound() + " "  + "его цвет: " + this.getColor() + " " + "его возраст: " + this.getAge());
    }

    public static class Builder{
        //обязательные
        private String name;
        private int id;
        //необязательные
        private short age = 0;
        private String kind = "none";
        private String sound = " arrrr";
        private String color = "common";

        public Builder(String name, int id){
            this.name = name;
            this.id = id;
        }

        public Builder age(short age){
            this.age = age;
            return this;
        }

        public Builder kind(String kind){
            this.kind = kind;
            return this;
        }

        public Builder sound(String sound){
            this.sound = sound;
            return this;
        }

        public Builder color(String color){
            this.color = color;
            return this;
        }

        public Animal build(){
            return new Animal(this);
        }
    }
}
