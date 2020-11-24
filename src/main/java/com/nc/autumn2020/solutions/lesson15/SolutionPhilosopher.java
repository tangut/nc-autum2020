package com.nc.autumn2020.solutions.lesson15;

import com.nc.autumn2020.solutions.LessonApi;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Semaphore;

public class SolutionPhilosopher implements LessonApi {

    public static String generateString(Random rng, String characters, int length)
    {
        char[] text = new char[length];
        for (int i = 0; i < length; i++)
        {
            text[i] = characters.charAt(rng.nextInt(characters.length()));
        }
        return new String(text);
    }


    @Override
    public void executeSolution(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        ArrayList<Philosopher> philosophers = new ArrayList<>();
        for (int i =0; i < 7; i++){
            philosophers.add(new Philosopher(semaphore, generateString(new Random(), "Rashsdghdsfhfdshjfsdhdfshdfs", 7)));
        }
        for (Philosopher philosopher : philosophers) {
            new Thread(philosopher).start();
        }
    }
}
