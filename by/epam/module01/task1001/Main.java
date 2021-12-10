package by.epam.module01.task1001;

import java.util.Scanner;

public class Main {
    //Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.

    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.print("a = ");

        while (!scanner.hasNextDouble()) {
            scanner.nextLine();
            System.out.print("a = ");
        }

        a = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("b = ");

        while (!scanner.hasNextDouble()) {
            scanner.nextLine();
            System.out.print("b = ");
        }

        b = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("c = ");

        while (!scanner.hasNextDouble()) {
            scanner.nextLine();
            System.out.print("c = ");
        }

        c = scanner.nextDouble();
        scanner.nextLine();

        z = (((a - 3.0) * b / 2.0) + c);

        System.out.println("z = " + z);
    }
}
