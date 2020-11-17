package com.nc.autumn2020.solutions.practice.randprovider;

import java.util.Random;

public class RandomProvider implements AutoCloseable {
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

    public int getFirstElem() throws Exception {
        int result = array[0];
        int[] newArray = new int[n - 1];
        n--;
        if (n == -1) {
            close();
            throw new ProviderException(RandomProviderErrorCode.ARRAY_IS_EMPTY);
        }
        for (int i = 1; i < n; i++){
            newArray[i - 1] = array[i];
        }
        array = newArray;
        return result;
    }
    
    @Override
    public void close() throws Exception {
        System.out.println("Провайдер закрылся");
    }
}
