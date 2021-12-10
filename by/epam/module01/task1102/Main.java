package by.epam.module01.task1102;

import java.util.Scanner;

public class Main {
    //Найти max{min(a, b), min(c, d)}
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double d;

        a = -4;
        b = 2;
        c = 0;
        d = 5;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        System.out.println("max{min(a, b), min(c, d)} = " + Math.max(Math.min(a, b), Math.min(c, d)));
    }

}
