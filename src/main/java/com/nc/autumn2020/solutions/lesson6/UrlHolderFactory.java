package com.nc.autumn2020.solutions.lesson6;

public class UrlHolderFactory {

    public UrlHolderFactory(){

    }

    public UrlHolder createInstance(String url){
        UrlHolder urlHolder = new UrlHolder();
        return urlHolder;
    }

    private void parse(String url, UrlHolder urlHolder){

    }

}
