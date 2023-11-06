package com.moroz.homework;

public class Task2 {

    public static void main(String[] args) {
        int number = 9999;
        int lastNumber = number / 100;
        int firstNumber = number % 100;
        int allNumber = lastNumber + firstNumber;
        System.out.println(lastNumber);
        System.out.println(firstNumber);
        System.out.println(allNumber);
    }

}