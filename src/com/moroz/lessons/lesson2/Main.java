package com.moroz.lessons.lesson2;

public class Main {
    public static void main(String[] args) {
        int dayNumber = 3;
        String message;
        if (dayNumber == 1) {
            message = "Monday";
        } else if (dayNumber == 2) {
            message = "Thuesday";
        } else if (dayNumber == 3) {
            message = "Wednesday";
        } else if (dayNumber == 4) {
            message = "Thursday";
        } else if (dayNumber == 5) {
            message = "Friday";
        } else if (dayNumber == 6) {
            message = "Saturday";
        } else if (dayNumber == 7) {
            message = "Sunday";
        } else {
            message = "Не корректно введен день недели";
        }
        System.out.println(message);



        int monthNumber = 10;
        switch (monthNumber) {
            case 1:
                message = "January";
                break;
            case 2:
                message = "February";
                break;
            case 3:
                message = "March";
                break;
            case 4:
                message = "April";
                break;
            case 5:
                message = "May";
                break;
            case 6:
                message = "June";
                break;
            case 7:
                message = "July";
                break;
            case 8:
                message = "August";
                break;
            case 9:
                message = "September";
                break;
            case 10:
                message = "October";
                break;
            case 11:
                message = "November";
                break;
            case 12:
                message = "December";
                break;
            default:
                message = "Не корректно введен номер месяца";
        }
        System.out.println(message);



    }


}

