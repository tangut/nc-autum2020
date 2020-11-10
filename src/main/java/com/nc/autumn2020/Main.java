package com.nc.autumn2020;

import com.nc.autumn2020.solutions.lesson6.DinamicClassLoaderExample;
import com.nc.autumn2020.solutions.lesson6.UrlHolder;
import com.nc.autumn2020.solutions.practice.Figure;
import com.nc.autumn2020.solutions.practice.Square;
import com.nc.autumn2020.solutions.practice.Triangle;
import com.nc.autumn2020.solutions.practice.fruits.Basket;
import com.nc.autumn2020.solutions.practice.fruits.Fruit;
import com.nc.autumn2020.solutions.practice.fruits.Person;
import com.nc.autumn2020.solutions.practice.fruits.PlasticContainer;
import com.nc.autumn2020.solutions.practice.lesson7.Role;
import com.nc.autumn2020.solutions.practice.lesson7.User;
import com.nc.autumn2020.solutions.practice.randprovider.ProviderException;
import com.nc.autumn2020.solutions.practice.randprovider.RandomProvider;
import com.nc.autumn2020.solutions.practice.randprovider.RandomProviderErrorCode;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws ProviderException {
        //new Solution1().run(args);
        //new SolutionDescript().run(args);

        Fruit fruit = new Fruit(1000, 1, "Apple");
        Fruit fruit2 = new Fruit(150, 4, "Orange");
        Basket basket = new Basket();
        basket.putFruit(fruit);
        basket.putFruit(fruit2);
        PlasticContainer plasticContainer = new PlasticContainer();
        plasticContainer.putFruit(fruit2);
        plasticContainer.putFruit(fruit2);
        plasticContainer.putFruit(fruit2);
        plasticContainer.putFruit(fruit2);
        plasticContainer.putFruit(fruit2);
        plasticContainer.putFruit(fruit2);
        Person person = new Person("Apple");
        person.eatFruit(basket);
        person.eatFruit(basket);

        RandomProvider randomProviderrar = new RandomProvider(5);
        int rar1 = randomProviderrar.getFirstElem();
        randomProviderrar.clear();

        RandomProvider randomProvider = new RandomProvider(3);
        int a1 = randomProvider.getFirstElem();
        int a2 = randomProvider.getFirstElem();
        int a3 = randomProvider.getFirstElem();
        try{
            int a4 = randomProvider.getFirstElem();
        }
        catch (Exception ex){
            throw new ProviderException(RandomProviderErrorCode.ARRAY_IS_EMPTY);
        }
    }

}
