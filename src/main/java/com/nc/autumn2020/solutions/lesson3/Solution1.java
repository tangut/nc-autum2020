package com.nc.autumn2020.solutions.lesson3;

public class Solution1 {
    public static void run(String[] args) {
        Animal anim = new Animal.Builder("Горшок", 694).age((short)15).color("чёрный").build();
        anim.printAnimal();
    }
}
