package com.nc.autumn2020;

import com.nc.autumn2020.solutions.lesson3.Animal;

public class Main {
    public static void main(String[] args) {
        Animal anim = new Animal.Builder("Горшок", 694).age((short)15).color("чёрный").build();
        anim.printAnimal();
    }
}
