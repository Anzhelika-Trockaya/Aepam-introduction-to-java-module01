package by.epam.module01.task1005;

import java.util.Scanner;

public class Main {
    //Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
    // данное значение длительности в часах, минутах и секундах в следующей форме:
    // ННч ММмин SSc.
    public static void main(String[] args) {
        int t;
        int hours;
        int minutes;
        int seconds;

        Scanner scanner = new Scanner(System.in);
        System.out.print("T = ");

        t = scanner.nextInt();

        if (t >= 0 && t < 360000) {

            hours = t / 3600;
            minutes = (t - hours * 3600) / 60;
            seconds = t - hours * 3600 - minutes * 60;

            System.out.printf("%02dч %02dмин %02dс", hours, minutes, seconds);

        } else {
            System.out.println("Incorrect T!");
        }
    }

}

