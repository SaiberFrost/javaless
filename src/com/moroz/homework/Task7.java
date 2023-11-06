package com.moroz.homework;

public class Task7 {

    /*
     * Задать промежуток времени в секундах в виде переменной. Следует вывести
     * его на экран в виде часов минут и секунд,суток и недель.
     * /*
     * 62
     * часов 0
     * минут 1
     * секунд 2
     *
     *
     * 143
     * часов 0
     * минут 2
     * секунд 43
     *
     *
     * 3743
     * часов 1
     * минут 2
     * секунд 43
     */
    public static void main(String[] args) {
        int intervalInSeconds = 648958;
        int days = 0;
        int weeks = 0;
        int minutes = 0;
        int hours = 0;
        int seconds = 0;
        int daysInSeconds = intervalInSeconds / 86400;
        days = daysInSeconds;
        weeks = days / 7;
        int intervalInSecondsWithoutDays = intervalInSeconds - (daysInSeconds * 86400);
        hours = intervalInSecondsWithoutDays / 3600;
        int hoursInSeconds = hours * 3600;
        int intervalInSecondsWithoutHours = intervalInSeconds - hoursInSeconds;
        minutes = hours % 60;
        seconds = intervalInSecondsWithoutHours % 60;
        System.out.println("Weeks: " + weeks);
        System.out.println("Days: " + days);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }

}
