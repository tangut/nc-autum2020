package com.springTest.entities;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Radio {
    String nameOfStation;
    private ArrayList<String> listOfSongs = new ArrayList<>();

    public Radio(){

    }

    public Radio(String nameOfStation) {
        this.nameOfStation = nameOfStation;
        listOfSongs.add("tatatsa");
        listOfSongs.add("sdfdfsfds");
        listOfSongs.add("fddfgfdggfd");
    }

    public String getNameOfStation() {
        return nameOfStation;
    }

    public void setNameOfStation(String nameOfStation) {
        this.nameOfStation = nameOfStation;
    }

    public ArrayList<String> getListOfSongs() {
        return listOfSongs;
    }

    public void setListOfSongs(ArrayList<String> listOfSongs) {
        this.listOfSongs = listOfSongs;
    }


    @Override
    public String toString() {
        return "Radio{" +
                "nameOfStation='" + nameOfStation + '\'' +
                ", listOfSongs=" + listOfSongs +
                '}';
    }
}
