package by.epam.module01.task1006;

import java.util.Scanner;

public class Main {
    //Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
//принадлежит закрашенной области, и false — в противном случае:
    // файл image.ipg
    public static void main(String[] args) {
        double x;
        double y;

        Scanner scanner = new Scanner(System.in);

        System.out.print("x = ");
        x = scanner.nextDouble();
        System.out.print("y = ");
        y = scanner.nextDouble();

        System.out.println(((y > 0 && y <= 4 && Math.abs(x) <= 2) || (y <= 0 && y >= -3 && Math.abs(x) <= 4))
                && (y != -1 || x != 0));

    }

}
