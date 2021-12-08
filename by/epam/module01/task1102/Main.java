package by.epam.module01.task1102;

import java.util.Scanner;

public class Main {
    //Найти max{min(a, b), min(c, d)}
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double d;

        Scanner scanner = new Scanner(System.in);

        System.out.print("a = ");
        a = scanner.nextDouble();
        System.out.print("b = ");
        b = scanner.nextDouble();
        System.out.print("c = ");
        c = scanner.nextDouble();
        System.out.print("d = ");
        d = scanner.nextDouble();

        System.out.println("max{min(a, b), min(c, d)} = " + Math.max(Math.min(a, b), Math.min(c, d)));
    }

}
