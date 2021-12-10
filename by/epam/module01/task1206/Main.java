package by.epam.module01.task1206;

public class Main {
    //Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
    public static void main(String[] args) {
        for (int i = 32; i < 128; i++) {
            System.out.println((char) i + " - " + i);
        }

    }
}
