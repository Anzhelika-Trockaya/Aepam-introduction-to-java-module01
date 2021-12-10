package by.epam.module01.task1207;

import java.util.Scanner;

public class Main {
    //Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
    //m и n вводятся с клавиатуры.
    public static void main(String[] args) {
        double m;
        double n;

        m = -6.2;
        n = 35.9999999999;
        System.out.println("m = " + m);
        System.out.println("n = " + n);

        System.out.println("Divisors of numbers from the interval [ " + m + " ; " + n + " ]  : ");

        for (int number = (int) Math.ceil(m); number <= (int) Math.floor(n); number++) {

            if (number > 0) {

                System.out.print("Divisors of " + number + ": ");

                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        System.out.print(i + " ");
                    }
                }

                System.out.println();

            }
        }
    }

}
