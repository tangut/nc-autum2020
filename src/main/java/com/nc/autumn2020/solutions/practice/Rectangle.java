package com.nc.autumn2020.solutions.practice;


public class Rectangle extends Figure {
    private static int height, width;

    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    public int countPerimeter(){
        return 2*height + 2*width;
    }

    public double countArea(){
        return height*width;
    }

    public void draw(){
        System.out.println("Rectangle");
    }

}
