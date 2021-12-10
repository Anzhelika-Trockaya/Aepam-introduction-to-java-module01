package by.epam.module01.task1104;

public class Main {
    //Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
    //отверстие.
    public static void main(String[] args) {
        double a = 5;
        double b = 4;
        double x = 5;
        double y = 8.0;
        double z = 4.0;
        System.out.println(canBrickGoThroughTheHole(a, b, x, y, z));
    }

    public static boolean canGoThroughTheHole(double a, double b, double x, double y, double z) {
        if (Math.max(a, b) >= x) {   // if side x goes through the larger side of the hole
            if (Math.min(a, b) >= Math.min(y, z)) { //if the smaller of y and z passes through the smaller side of the hole
                return true;
            } else if (Math.min(a, b) >= x && Math.max(a, b) >= Math.min(y, z)) {//if x goes through the smaller side
                return true;                                              // and y or z goes through the larger side
            }
        } else if (Math.max(a, b) >= Math.max(y, z) && Math.min(a, b) >= Math.min(y, z)) {
            return true; //if the larger of y and z passes through the larger side of the hole,
            // and the smaller one passes through the smaller
        }
        return false;
    }

    public static boolean canBrickGoThroughTheHole(double a, double b, double x, double y, double z) {
        return (x <= a && y <= b) || (x <= a && z <= b) || (x <= b && y <= a) || (x <= b && z <= a) || (y <= a && z <= b) || (y <= b && z <= a);
    }
}
