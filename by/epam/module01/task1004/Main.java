package by.epam.module01.task1004;

import java.util.Scanner;

public class Main {
    //Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
    //дробную и целую части числа и вывести полученное значение числа.

    public static void main(String[] args) {
        double r;
        String rRegex;

        rRegex = "\\d\\d\\d\\.\\d\\d\\d";
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter R in format nnn.ddd.\nR = ");
        r = scanner.nextDouble();

        if (Double.toString(r).matches(rRegex)) {
            System.out.println("swap R : " + swap(r));
            System.out.println("swap R : " + swap2(r));
        } else {
            System.out.println("Incorrect R: " + r);
        }
    }

    public static double swap(double r) {
        String rString;
        String swappedRString;
        double swappedR;

        rString = Double.toString(r);

        swappedRString = rString.substring(4);
        swappedRString += '.';
        swappedRString += rString.substring(0, 3);

        swappedR = Double.parseDouble(swappedRString);

        return swappedR;
    }

    public static double swap2(double r) {
        double swappedR;
        int intPart;
        int doublePart;

        intPart = (int) r;
        doublePart = (int) Math.round((r - intPart) * 1000);

        swappedR = doublePart + intPart / 1000.0;

        return swappedR;
    }
}
