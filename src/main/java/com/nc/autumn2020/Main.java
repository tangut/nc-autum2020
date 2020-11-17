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
import com.nc.autumn2020.solutions.practice.weeks.QuoteOfDay;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws ProviderException {

        new QuoteOfDay().executeSolution(args);
    }

}
