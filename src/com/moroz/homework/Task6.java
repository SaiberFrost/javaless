package com.moroz.homework;

public class Task6 {

    public static void main(String[] args) {
        double pointOneX = 2;
        double pointTwoX = 7;
        double pointOneY = 5;
        double pointTwoY = 3;
        double k = (pointTwoY - pointOneY) / (pointTwoX - pointOneX);
        double b = pointTwoY - k * pointTwoX;
        System.out.println("y = " + k + "x + " + b);
    }

}
