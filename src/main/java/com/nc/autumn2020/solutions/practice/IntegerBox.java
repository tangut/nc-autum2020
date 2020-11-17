package com.nc.autumn2020.solutions.practice;

class Box <T> {
    T item;

    public void set(T t){
        this.item = t;
    }

    public T get(){
        return this.item;
    }
}
