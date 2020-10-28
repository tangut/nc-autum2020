package com.nc.autumn2020.solutions.practice;

public class Square extends Figure {
    private static int a;

    public Square(int a){
        this.a = a;
    }

    public int countPerimeter(){
        return 4*a;
    }

    public double countArea(){
        return Math.pow(a, 2);
    }

    public void draw(){
        System.out.println("Square");
    }
}
