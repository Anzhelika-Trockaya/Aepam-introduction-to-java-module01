package by.epam.module01.task1202;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //Вычислить значения функции на отрезке [а,b] c шагом h: y={ x, x >2;
    //{-x, x<=2.
    public static void main(String[] args) {
        BigDecimal a;
        BigDecimal b;
        BigDecimal h;
        double[] values;

        Scanner scanner = new Scanner(System.in);

        System.out.print("a = ");
        a = scanner.nextBigDecimal();
        System.out.print("b = ");
        b = scanner.nextBigDecimal();
        System.out.print("h = ");
        h = scanner.nextBigDecimal();

        if (b.doubleValue() >= a.doubleValue()) {
            values = new double[(int) ((b.doubleValue() - a.doubleValue()) / h.doubleValue()) + 1];

            for (int i = 0; i < values.length; i++) {
                values[i] = a.doubleValue() > 2 ? a.doubleValue() : -1 * a.doubleValue();
                a = a.add(h);
            }

        } else {
            System.out.println("a cannot be more than b!");
            return;
        }
        System.out.println("Function values on a segment [ " + a + " , " + b + " ] with a step " + h + " : " + Arrays.toString(values));
    }

}
