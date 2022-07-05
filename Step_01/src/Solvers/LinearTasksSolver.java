package Solvers;

public class LinearTasksSolver {

    public static int solve_01(int a, int b, int c) {
        return ((a - 3) * b / 2) + c;
    }

    public static double solve_02(double a, double b, double c) {
        return (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - a * a * a * c + 1 / (b * b);
    }

    public static double solve_03(double x, double y) {
        return ((Math.sin(x) + Math.cos(y)) * Math.tan(x * y) / (Math.cos(x) - Math.sin(y)));
    }

    public static double solve_04(Double x) {
        return (x * 1000) % 1000 + (double)(x.intValue() % 1000) / 1000;
    }

    public static String solve_05(int t) {
        int hours = t / 3600;

        t %= 3600;

        int minutes = t / 60;

        t %= 60;

        String result = "";
        if (hours < 10) {
            result += '0';
        }
        result += hours + "ч ";
        if (minutes < 10) {
            result += '0';
        }
        result += minutes + "мин ";
        if (t < 10) {
            result += '0';
        }
        result += t + "с";

        return result;
    }

    public static boolean solve_06(double x, double y) {
        if(y > 4 || y < -3 || x > 4 || x < -4) {
            return false;
        }
        if(y > 0) {
            return !(x > 2) && !(x < -2);
        }
        return true;
    }

}
