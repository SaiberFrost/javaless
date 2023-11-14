package com.moroz.homework;

import static java.lang.Math.max;

public class Task10 {

    public static void main(String[] args) {
    int a = 20;
    int b = 8;
    int c = 19;
    int d = 5;
    int e = 30;
    int f = 20;
    boolean inLength = (e >= (a + c)) & (f >= max(b , d));
    boolean inWidth = (e >= max(a , c)) & (f >= (b + d));
    boolean fit = inLength & inWidth;
    if (fit)  {System.out.print(" дома поместятся на участке ");}
    else {System.out.print(" дома не поместятся на участке ");}
    }
}


