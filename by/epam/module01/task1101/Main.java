package by.epam.module01.task1101;

import java.util.Scanner;

public class Main {
    //Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
    //он прямоугольным.

    public static void main(String[] args) {
        int a;
        int b;

        a = 70;
        b = 100;

        System.out.println("∠ A = " + a);
        System.out.println("∠ B = " + b);

        if (a > 0 && b > 0) {
            System.out.println(a + b < 180 ? "Triangle exists" : "Triangle doesn't exist");
            if (a + b < 180) {
                System.out.println((a == 90 || b == 90 || 180 - a - b == 90) ? "Triangle is right" : "Triangle is not right");
            }
        } else {
            System.out.println("Angle can not be negative!");
        }
    }
}
