package com.nc.autumn2020.solutions.additional.descript;

import java.io.FileNotFoundException;

public class SolutionDescript {
    public static void run(String[] args) throws FileNotFoundException {
        String filepath = "D:\\Program Files\\education\\src\\main\\java\\com\\nc\\autumn2020\\tasks\\additional\\descript\\input.txt";
        DescriptionBase64 descriptionBase64 = new DescriptionBase64();
        descriptionBase64.Descript(filepath);
    }
}
