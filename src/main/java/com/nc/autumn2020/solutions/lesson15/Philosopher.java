package com.nc.autumn2020.solutions.lesson15;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Philosopher implements Runnable {
    Semaphore semaphore;
    String name;

    public Philosopher(Semaphore semaphore, String name){
        this.semaphore = semaphore;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println("Философ по имени " + name + " сел покушать.");
            Thread.sleep(new Random().nextInt(5000) + 1);
            System.out.println("Философ по имени " + name + " покушал и вышел из за стола.");
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
