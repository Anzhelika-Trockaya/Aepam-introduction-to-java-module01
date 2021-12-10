package by.epam.module01.task1205;

public class Main {
    //Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
    //заданному е. Общий член ряда имеет вид: an = 1/2^n + 1/3^n
    public static void main(String[] args) {
        double sum = 0;
        double e;
        double a;

        e = 0.162;
        System.out.println("e = " + e);

        if (e <= 0) {
            System.out.println("The sum of the members of the series greater than " + e + " : Infinity");
            return;
        }

        for (int i = 1; (a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i)) >= e; i++) {
            sum += a;
        }

        System.out.println("The sum of the members of the series greater than " + e + " : " + sum);

    }
}
