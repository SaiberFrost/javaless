package com.moroz.homework;

public class Task12 {
    public static void main(String[] args) {

        int day = 28,month = 2,year = 2023;
        if ((day == 28) & month == 2 & year % 4 == 0 & year % 400 == 0 & year % 100 != 0)
        {
            day = 1; month ++;
            System.out.println("дата следующего дня: " + day + ":" + month + ":" + year);
        }
        else if (day == 29 & month == 2 & !(year % 4 == 0 & year % 400 == 0 & year % 100 != 0))
        {
            day = 1; month ++;
            System.out.println("дата следующего дня: " + day + ":" + month + ":" + year);
        }
        else if((day == 31) && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10))
        {
            day = 1; month ++;
            System.out.println("дата следующего дня: " + day + ":" + month + ":" + day);
        }
        else if((day == 30) && (month == 4 || month == 6 || month == 9 || month == 11))
        {
            day = 1; month ++;
            System.out.println("дата следующего дня: " + day + ":" + month + ":" + year);
        }
        else if((day == 31) && month == 12)
        {
            day = 1; month =  1; year ++;
            System.out.println("дата следующего дня: " + day + ":" + month + ":" + year);
        }
        else
        {
            day ++;
            System.out.println("дата следующего дня: " + day + ":" + month + ":" + year);
        }

    }

}

