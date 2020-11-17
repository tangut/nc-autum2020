package com.nc.autumn2020.solutions.practice.weeks;


public enum DaysOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public static DaysOfWeek getValueOf(String dayOfWeek){
        DaysOfWeek day = DaysOfWeek.valueOf(dayOfWeek.toUpperCase());
        return day;
    }

    public static int compareTo(DaysOfWeek day1, DaysOfWeek day2){
        int res = 0;
        if (day1.equals(day2))
            res = 0;
        if (day1.ordinal() < day2.ordinal())
            res = -1;
        if (day1.ordinal() > day2.ordinal())
            res = 1;
        return res;
    }
}
