package com.nc.autumn2020.solutions.practice.randprovider;

import java.util.Random;

public class RandomProvider {
    private int n; // размерность массива, будет уменьшаться при получении первого элемента
    private int[] array;

    public int getN() {
        return n;
    }


    public int[] getArray() {
        return array;
    }

    public RandomProvider(int n){
        this.n = n;
        array = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++){
            array[i] = rand.nextInt();
        }
    }

    public int getFirstElem(){
        int result = array[0];
        int[] newArray = new int[n - 1];
        for (int i = 1; i < n; i++){
            newArray[i - 1] = array[i];
        }
        n--;
        array = newArray;
        return result;
    }

    // очищаем массив
    public void clear(){
        n = 0;
        int[] newArray = new int[n];
        this.array = newArray;
    }

}
