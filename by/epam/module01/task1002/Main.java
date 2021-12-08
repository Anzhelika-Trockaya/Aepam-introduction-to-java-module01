package by.epam.module01.task1002;

import java.util.Scanner;

public class Main {
    // Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    //(b+sqrt(b^2+4ac))/2a -a^3*c+b^(-2)
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.print("a = ");

        while (!scanner.hasNextDouble()) {
            scanner.nextLine();
            System.out.print("a = ");
        }

        a = scanner.nextDouble();

        System.out.print("b = ");

        while (!scanner.hasNextDouble()) {
            scanner.nextLine();
            System.out.print("b = ");
        }

        b = scanner.nextDouble();

        System.out.print("c = ");

        while (!scanner.hasNextDouble()) {
            scanner.nextLine();
            System.out.print("c = ");
        }

        c = scanner.nextDouble();

        if (a != 0 && b != 0 && (b * b + 4 * a * c) >= 0) {
            System.out.println("Result: "
                    + ((b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2)));
        } else {
            System.out.println("Expression has no solution!");
        }
    }

}
