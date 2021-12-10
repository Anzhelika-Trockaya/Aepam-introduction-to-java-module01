package by.epam.module01.task1203;

public class Main {
    //Найти сумму квадратов первых ста чисел
    public static void main(String[] args) {
        int sumOfSquares = 0;

        for (int i = 1; i < 101; i++) {

            if (sumOfSquares <= Integer.MAX_VALUE - i * i) {
                sumOfSquares += i * i;
            } else {
                System.out.println("The answer is too big!");
                return;
            }

        }

        System.out.println("The sum of the squares of the first one hundred numbers = " + sumOfSquares);
    }
}
