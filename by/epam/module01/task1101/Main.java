package by.epam.module01.task1101;

import java.util.Scanner;

public class Main {
    //Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
    //он прямоугольным.

    public static void main(String[] args) {
        int a;
        int b;

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.print("∠ A = ");

        while (!scanner.hasNextInt()) {
            System.out.print("∠ A = ");
            scanner.nextLine();
        }

        a = scanner.nextInt();

        System.out.print("∠ B = ");

        while (!scanner.hasNextInt()) {
            System.out.print("∠ B = ");
            scanner.nextLine();
        }

        b = scanner.nextInt();

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
