package by.epam.module01.task1003;

import java.util.Scanner;

public class Main {
    //Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    // (sin x + cos y) / (cos x - sin y) * tg xy
    public static void main(String[] args) {
        double x;
        double y;

        Scanner scanner = new Scanner(System.in);

        System.out.print("x = ");
        x = scanner.nextDouble();
        System.out.print("y = ");
        y = scanner.nextDouble();

        if (Math.cos(x) != Math.sin(y) && Math.cos(x * y) != 0) {
            System.out.println("result: "
                    + ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y)));
        } else {
            System.out.println("Expression has no solution!");
        }
    }
}
