package com.nc.autumn2020;

import com.nc.autumn2020.solutions.additional.descript.SolutionDescript;
import com.nc.autumn2020.solutions.lesson3.Solution1;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        new Solution1().run(args);
        new SolutionDescript().run(args);
    }
}
