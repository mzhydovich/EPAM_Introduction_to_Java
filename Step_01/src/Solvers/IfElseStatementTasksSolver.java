package Solvers;

public class IfElseStatementTasksSolver {

    public static String solve_01(int x, int y) {
        if (x + y >= 180 || x <= 0) {
            return "No";
        }

        String ans = "Yes, ";
        if (x + y == 90 || x == 90 || y == 90) {
            ans += "rectangular";
        } else {
            ans += "non-rectangular";
        }
        return ans;
    }

    public static int solve_02(int a, int b, int c, int d) {
        int min_ab = a;
        if (b < min_ab) {
            min_ab = b;
        }

        int min_cd = c;
        if (d < min_cd) {
            min_cd = d;
        }

        if (min_ab > min_cd) {
            return min_ab;
        }

        return min_cd;
    }

    public static boolean solve_03(double x1, double y1, double x2, double y2, double x3, double y3) {
        if (x1 == x2 || x1 == x3 || x2 == x3 || y1 == y2 || y1 == y3 || y2 == y3) {
            return (x1 == x2 && x1 == x3) || (y1 == y2 && y1 == y3);
        }
        return (x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1);
    }

    public static boolean solve_04(int a, int b, int x, int y, int z) {

        int min1 = a;
        int max1 = b;

        if (b < min1) {
            min1 = b;
            max1 = a;
        }

        int min2 = x;
        int min3 = y;

        if (y >= z && y >= x) {
            min3 = z;
        } else {
            min2 = z;
        }

        if (min2 > min3) {
            int tmp = min2;
            min2 = min3;
            min3 = tmp;
        }

        return min2 <= min1 && min3 <= max1;
    }

    public static double solve_05(double x) {
        if (x <= 3) {
            return x * x - 3 * x + 9;
        }
        return 1.0 / (x * x * x + 6);
    }

}
