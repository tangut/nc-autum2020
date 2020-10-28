package com.nc.autumn2020;

import com.nc.autumn2020.solutions.additional.descript.SolutionDescript;
import com.nc.autumn2020.solutions.lesson3.Solution1;
import com.nc.autumn2020.solutions.practice.Figure;
import com.nc.autumn2020.solutions.practice.Square;
import com.nc.autumn2020.solutions.practice.Triangle;

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
    }
}
