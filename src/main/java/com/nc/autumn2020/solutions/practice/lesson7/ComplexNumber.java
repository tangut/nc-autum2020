package com.nc.autumn2020.solutions.practice.lesson7;

import java.util.Objects;

public class ComplexNumber {
    private int a;
    private int i;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public ComplexNumber(int a, int i) {
        this.a = a;
        this.i = i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return a == that.a &&
                i == that.i;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, i);
    }
}
