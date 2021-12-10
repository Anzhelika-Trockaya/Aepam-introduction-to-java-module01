package by.epam.module01.task1105;

public class Main {
    //Вычислить значение функции:
    //image.jpg
    public static void main(String[] args) {
        double x;
        double f;

        x = 5;

        System.out.println("x = " + x);

        f = (x <= 3 ? (x * x - 3 * x + 9) : (1 / (Math.pow(x, 3) + 6)));

        System.out.println("F(x) = " + f);
    }
}
