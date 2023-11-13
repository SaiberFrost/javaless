package com.moroz.homework;

public class Task9 {
    public static void main(String[] args) {
    int fingerNumber = 7;
    String message;
    if (fingerNumber == 1) {
        message = "Большой";
    } else if (fingerNumber == 2) {
        message = "Указательный";
    } else if (fingerNumber == 3) {
        message = "Средний";
    } else if (fingerNumber == 4) {
        message = "Безымянный";
    } else if (fingerNumber == 5) {
        message = "Мизинец";
    } else {
        message = "Не корректно введен номер пальца";
    }
    System.out.println(message);
}
}