package com.nc.autumn2020.solutions.practice;

public class Triangle extends Figure{
    private  static  int a, b, c;

    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int countPerimeter(){
        return a+b+c;
    }

    public double countArea(){
        return Math.sqrt((countPerimeter() / 2) * (countPerimeter() - a) + (countPerimeter() - b) + (countPerimeter() - c));
    }

    public void draw(){
        System.out.println("Triangle");
    }
}
