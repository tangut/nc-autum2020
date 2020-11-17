package com.nc.autumn2020.solutions.practice.weeks;

import com.nc.autumn2020.solutions.LessonApi;
import java.util.Scanner;

public class QuoteOfDay implements LessonApi {

    public static void getQuote(DaysOfWeek dayOfWeek){
        switch (dayOfWeek){
            case MONDAY: {
                System.out.println("Понедельник начинается в суббуоту");
                break;
            }
            case TUESDAY: {
                System.out.println("Нет такого понедельника, который не уступил место вторинку");
                break;
            }
            case WEDNESDAY: {
                System.out.println("Среда - это маленькая пятница");
                break;
            }
            case THURSDAY: {
                System.out.println("После дождичка в четверг");
                break;
            }
            case FRIDAY: {
                System.out.println("Пятница - пора расслабиться");
                break;
            }
            case SATURDAY: {
                System.out.println("Нет ничего ужаснее работать в субботу");
                break;
            }
            case SUNDAY: {
                System.out.println("Воскресенье - день накануне понедельника, так что он отравлен");
                break;
            }
        }
    }

    @Override
    public void executeSolution(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ввведите дни недели через пробел, чтобы получить цитату для наибольшой недели(регистр не имеет значения)");
        String string = scan.nextLine();
        String[] strings = string.split(" ");
        DaysOfWeek[] days = new DaysOfWeek[strings.length];
        for (int i = 0; i < strings.length; i++){
            days[i] = DaysOfWeek.getValueOf(strings[i]);
        }
        DaysOfWeek dayMax = days[0];
        for (int i = 0; i < days.length; i++){
            if (DaysOfWeek.compareTo(days[i], dayMax) == 1)
                dayMax = days[i];
        }
        getQuote(dayMax);
    }
}
