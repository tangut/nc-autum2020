package com.nc.autumn2020.solutions.lesson3;

import com.nc.autumn2020.solutions.LessonApi;

public class Solution1 implements LessonApi {
    public void executeSolution(String[] args) {
        Animal anim = new Animal.Builder("Горшок", 694).age((short)15).color("чёрный").build();
        anim.printAnimal();
    }
}
