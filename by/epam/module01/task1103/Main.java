package by.epam.module01.task1103;

public class Main {
    //Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
    public static void main(String[] args) {
        Point a = new Point(1, 1);
        Point b = new Point(3, 3);
        Point c = new Point(-4, -4);

        System.out.println(areOnTheSameLine(a, b, c));
    }

    public static class Point {
        double x;
        double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    public static boolean areOnTheSameLine(Point a, Point b, Point c) { // y=kx+m - equation of a line
        double k;
        double m;

        k = (a.y - b.y) / (a.x - b.x);  //using the points A and B I find the coefficients of the equation
        m = a.y - k * a.x;

        return k * c.x + m == c.y;
    }

}
