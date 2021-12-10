package by.epam.module01.task1201;

import java.util.Scanner;

public class Main {
    // Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
    //все числа от 1 до введенного пользователем числа.
    public static void main(String[] args) {
        int x;
        int sum;

        x = 100;
        System.out.println("Enter a natural number: " + x);

        if (x > 0) {
            sum = 0;

            for (int i = 1; i <= x; i++) {

                if (sum <= Integer.MAX_VALUE - i) {
                    sum += i;
                } else {
                    System.out.println("The answer is too big!");
                    return;
                }

            }

            System.out.println("Sum of numbers from 1 to " + x + " = " + sum);

        } else {
            System.out.println("The number does not meet the condition.");
        }
    }
}
