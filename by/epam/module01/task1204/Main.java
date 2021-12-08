package by.epam.module01.task1204;

public class Main {
    // Составить программу нахождения произведения квадратов первых двухсот чисел.
    public static void main(String[] args) {
        int productOfNumbers = 1;

        for (int i = 2; i < 201; i++) {
            if (Integer.MAX_VALUE / i > productOfNumbers) {
                productOfNumbers *= i;
            } else {
                System.out.println("Answer is too big! " + productOfNumbers + " * " + i + "> Integer.MAX_VALUE");
                return;
            }
        }

        System.out.println("Product of the squares of the first two hundred numbers = " + productOfNumbers);
    }
}
