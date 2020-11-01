package com.nc.autumn2020;

import com.nc.autumn2020.solutions.lesson6.DinamicClassLoaderExample;
import com.nc.autumn2020.solutions.practice.Figure;
import com.nc.autumn2020.solutions.practice.Square;
import com.nc.autumn2020.solutions.practice.Triangle;
import com.nc.autumn2020.solutions.practice.fruits.Basket;
import com.nc.autumn2020.solutions.practice.fruits.Fruit;
import com.nc.autumn2020.solutions.practice.fruits.Person;
import com.nc.autumn2020.solutions.practice.fruits.PlasticContainer;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //new Solution1().run(args);
        //new SolutionDescript().run(args);
        Square square = new Square(4);
        Triangle triangle = new Triangle(2, 3, 4);
        Figure[] array = {square, triangle};
        double sum = 0;
        for (Figure value:array){
            sum+=value.countArea();
        }
        System.out.println("Сумма: " + sum);
        new DinamicClassLoaderExample().run(args);

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
    }

}
