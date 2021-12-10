package by.epam.module01.task1208;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //Даны два числа. Определить цифры, входящие в запись как первого так и второго числа
    public static void main(String[] args) {
        String a;
        String b;
        boolean contain0;
        boolean contain1;
        boolean contain2;
        boolean contain3;
        boolean contain4;
        boolean contain5;
        boolean contain6;
        boolean contain7;
        boolean contain8;
        boolean contain9;

        Scanner scanner = new Scanner(System.in);//write numbers to strings

        System.out.print("Enter a first number: ");
        a = scanner.nextLine();
        System.out.print("Enter a second number: ");
        b = scanner.nextLine();

        contain0 = a.contains("0") && b.contains("0");
        contain1 = a.contains("1") && b.contains("1");
        contain2 = a.contains("2") && b.contains("2");
        contain3 = a.contains("3") && b.contains("3");
        contain4 = a.contains("4") && b.contains("4");
        contain5 = a.contains("5") && b.contains("5");
        contain6 = a.contains("6") && b.contains("6");
        contain7 = a.contains("7") && b.contains("7");
        contain8 = a.contains("8") && b.contains("8");
        contain9 = a.contains("9") && b.contains("9");

        System.out.println("Digits included in both numbers:");
        if (contain0) {
            System.out.print(0 + " ");
        }
        if (contain1) {
            System.out.print(1 + " ");
        }
        if (contain2) {
            System.out.print(2 + " ");
        }
        if (contain3) {
            System.out.print(3 + " ");
        }
        if (contain4) {
            System.out.print(4 + " ");
        }
        if (contain5) {
            System.out.print(5 + " ");
        }
        if (contain6) {
            System.out.print(6 + " ");
        }
        if (contain7) {
            System.out.print(7 + " ");
        }
        if (contain8) {
            System.out.print(8 + " ");
        }
        if (contain9) {
            System.out.print(9 + " ");
        }

        if (!(contain0 || contain1 || contain2 || contain3 || contain4 || contain5 || contain6 || contain7 || contain8 || contain9)) {
            System.out.print("Numbers have not common digits!");
        }

        System.out.println();

    }

    public List<Integer> generalDigits(int number1, int number2) {
        List<Integer> digits;
        String a;
        String b;

        digits = new ArrayList<>();
        a = Integer.toString(number1);
        b = Integer.toString(number2);

        for (int i = 0; i < 10; i++) {
            if (a.contains(Integer.toString(i)) && b.contains(Integer.toString(i))) {
                digits.add(i);
            }
        }

        return digits;
    }

}
