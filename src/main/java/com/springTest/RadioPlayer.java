package com.springTest;

import com.springTest.entities.Radio;

import java.util.ArrayList;

public class RadioPlayer {
    private static ArrayList<Radio> listOfRadioStations;
    private static int count = 0;

    public RadioPlayer(){

    }

    public RadioPlayer(ArrayList<Radio> listOfRadioStations) {
        this.listOfRadioStations = listOfRadioStations;
    }

    public void switchStaiton(){
        if (count < listOfRadioStations.size() - 1){
            count++;
        }
        else{
            System.out.println("Все станции проиграны");
        }
    }

    public void playSongs(){
        Radio radioStation = listOfRadioStations.get(count);
        ArrayList<String> songs = radioStation.getListOfSongs();
        for (String song:songs){
            System.out.println("Сыграем песню: " + song);
        }
    }
}
