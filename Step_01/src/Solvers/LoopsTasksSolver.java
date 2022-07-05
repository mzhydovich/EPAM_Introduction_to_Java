package Solvers;

import java.math.BigInteger;
import java.util.Scanner;

public class LoopsTasksSolver {

    public static int solve_01() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter argument for task_01");
        int x = scanner.nextInt();

        int res = 0;
        for (int i = 1; i <= x; i++) {
            res += i;
        }

        return res;
    }

    public static String solve_02(double a, double b, double h) {

        StringBuilder res = new StringBuilder("\n");
        for (double i = a; i <= b; i += h) {
            if (i > 2) {
                res.append("y(").append(i).append(") = ").append(i).append("\n");
            } else {
                res.append("y(").append(i).append(") = ").append(-i).append("\n");
            }
        }

        return res.toString();
    }

    public static int solve_03() {
        int res = 0;
        for (int i = 1; i <= 100; i++) {
            res += i * i;
        }

        return res;
    }

    public static BigInteger solve_04() {
        BigInteger res = new BigInteger("1");
        for (int i = 2; i <= 200; i++) {
            res = res.multiply(new BigInteger(Integer.toString(i * i)));
        }

        return res;
    }

    public static double solve_05(double eps) {

        double res = 0;

        double power2 = 1.0 / 2;
        double power3 = 1.0 / 3;

        while (power2 + power3 >= eps) {
            res += power2 + power3;
            power2 /= 2;
            power3 /= 3;
        }

        return res;
    }

    public static String solve_06() {

        StringBuilder res = new StringBuilder();
        for (int i = 1; i < 100; i++) {
            res.append(i).append(" ").append((char) i).append('\n');
        }

        return res.toString();
    }

    public static String solve_07(int m, int n) {

        StringBuilder res = new StringBuilder("\n");
        for (int i = m; i <= n; ++i) {
            res.append(i).append(": ");
            for (int j = 2; j < i; ++j) {
                if (i % j == 0) {
                    res.append(j).append(" ");
                }
            }
            res.append("\n");
        }

        return res.toString();
    }

    public static String solve_08(int m, int n) {

        StringBuilder res = new StringBuilder();

        boolean[] num1 = new boolean[10];
        for (int i = 0; i < 10; i++) {
            num1[i] = false;
        }

        if (m == 0) {
            num1[0] = true;
        }

        while (m > 0) {
            num1[m % 10] = true;
            m /= 10;
        }

        boolean[] num2 = new boolean[10];
        for (int i = 0; i < 10; i++) {
            num2[i] = false;
        }

        if (n == 0) {
            num2[0] = true;
        }

        while (n > 0) {
            num2[n % 10] = true;
            n /= 10;
        }

        for (int i = 0; i < 10; ++i) {
            if (num1[i] && num2[i]) {
                res.append(i).append(" ");
            }
        }

        return res.toString().toString();
    }

}
